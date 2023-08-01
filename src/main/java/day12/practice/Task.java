package day12.practice;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.xdevapi.Statement;

import day11.solved.ConnectionUtil;

class Task {
	int id;
	String name;
	String status;

	public Task(String name, String status) {
		this.name = name;
		this.status = status;
	}

	
	public Task() {
		// TODO Auto-generated constructor stub
	}

}

class DAOException extends Exception {


	private static final long serialVersionUID = 2L;

	public DAOException(String msg) {
		super(msg);
	}

	public DAOException(Throwable te) {
		super(te);
	}

	public DAOException(String msg, Throwable te) {
		super(msg, te);
	}
}


class TaskValidator {
	
	public static boolean validate(Task task) {
		
		if(task.name == null || "".equals(task.name)) {
			throw new IllegalArgumentException("Task name can't be null or empty");
		}
		
		if(task.status == null || "".equals(task.status)) {
			throw new IllegalArgumentException("Task Status Can't Be Null or Empty");
		}
		
		return true;
		
	}
	
}

 class TestTaskDAO1 {
	public static Connection getConnection() {

		Connection con = null;

		String url = "jdbc:mysql://localhost:3306/Task";
		String userName = "root";
		String passWord = "123456";

		try {
			con = DriverManager.getConnection(url, userName, passWord);
		} catch (Exception e) {
			throw new RuntimeException("Unable to connect database");
		}

		return con;

	}

	public static boolean createTask(Task task) throws DAOException, IllegalArgumentException {
		
		try {
			TaskValidator.validate(task);
		}catch(IllegalArgumentException e) {
			throw new IllegalArgumentException(e.getMessage());
		}

		Connection con = null;

		try {

			String query = "INSERT INTO Task(name, status) values (?,?)";
			con = getConnection();

			PreparedStatement pst = con.prepareStatement(query);
			pst.setString(1, task.name);
			pst.setString(2, task.status);
			pst.executeUpdate();

		} catch (SQLException e) {
			throw new DAOException("Error Creating Task: ", e);
		} finally {
			ConnectionUtil.close(con, null, null);
		}
		
		return true;

	}

	public static boolean updateTask(Task task) throws DAOException {
		
		try {
			TaskValidator.validate(task);
		}catch(IllegalArgumentException e) {
			throw new IllegalArgumentException(e.getMessage());
		}
		
		if(task.id <= 0) {
			throw new IllegalArgumentException("Task Id conn't be 0 or less then 0");
		}

		Connection con = null;

		try {

			String query = "UPDATE Task SET name = ?, status = ? WHERE id = ?";
			con = getConnection();

			PreparedStatement pst = con.prepareStatement(query);
			pst.setString(1, task.name);
			pst.setString(2, task.status);
			pst.setInt(3, task.id);
			pst.executeUpdate();

		} catch (SQLException e) {
			throw new DAOException("Error Updating Task: ", e);
		} finally {
			ConnectionUtil.close(con, null, null);
		}
		
		return true;

	}

	public static boolean deleteTask(int taskId) throws DAOException {
		
		if(taskId <= 0) {
			throw new IllegalArgumentException("Task Id conn't be 0 or less then 0");
		}
		Connection con = null;

		try {

			String query = "DELETE FROM Task WHERE id = ?";
			con = getConnection();

			PreparedStatement pst = con.prepareStatement(query);
			pst.setInt(1, taskId);
			pst.executeUpdate();

		} catch (SQLException e) {
			throw new DAOException("Error Deleting Task: ", e);
		} finally {
			ConnectionUtil.close(con, null, null);
		}
		
		return true;
		
	}

	public static List<Task> getAllTasks() throws DAOException {

		Connection con = null;
		
		try {
		
			String quary = "SELECT * FROM Task";
			con = getConnection();
			
			Statement st = (Statement) con.createStatement();
			ResultSet rs = ((java.sql.Statement) st).executeQuery(quary);
			
			List<Task> tasks = new ArrayList<>();
			
			while(rs.next()) {
				Task task = new Task();
				task.id = rs.getInt("id");
				task.name = rs.getString("name");
				task.status = rs.getString("status");
				tasks.add(task);
			}
			return tasks;
			
		}catch(SQLException ex) {
			throw new DAOException("Error fetching tasks", ex);
		}finally {
			ConnectionUtil.close(con, null, null);
		}
		
		
	}
	
	public static void main(String[] args) throws DAOException {
		
		
		List<Task> tasks = getAllTasks();
		
		for(Task e : tasks) {
			System.out.println("ID: " + e.id + ", Task Name: " + e.name + ", Task Status: " + e.status);
		}
		
		
		
	}
}