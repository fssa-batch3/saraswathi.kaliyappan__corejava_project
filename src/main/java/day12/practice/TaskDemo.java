package day12.practice;

import java.util.List;

import day11.practice.DAOException;

public class TaskDemo {
	public static void main(String[] args) throws DAOException {
		Day12Task task = new Day12Task();
		task.name ="practice";
		task.status="process";
		TaskDAO.createTask(task);

		List<Day12Task> allTasks = TaskDAO.getAllTasks();
		for (Day12Task t : allTasks) {
			System.out.println("ID: " + t.id + ", Name: " + t.name + ", Status: " + t.status);
		}

	}
}