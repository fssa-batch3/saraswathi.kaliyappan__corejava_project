package day12.practice;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import day11.practice.DAOException;

public class TestTaskDAO {

    
    @Test
    public void testCreateTask() throws DAOException {
        Day12Task task = new Day12Task();
        task.name = "Test Task";
        task.status = "New";

        TaskDAO.createTask(task);

        List<Day12Task> allTasks = TaskDAO.getAllTasks();
        boolean taskFound = false;
        for (Day12Task t : allTasks) {
            if (t.name.equals("Test Task") && t.status.equals("New")) {
                taskFound = true;
                break;
            }
        }

        assertEquals(true, taskFound);
    }

    @Test
    public void testGetAllTasks() throws DAOException {
        List<Day12Task> allTasks = TaskDAO.getAllTasks();

        assertEquals(false, allTasks.isEmpty());
    }
}