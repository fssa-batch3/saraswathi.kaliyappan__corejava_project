package day06.practice;

import java.util.ArrayList;
import java.util.List;

public class Task {
	public String taskName;
    public int priority;
    

    public Task(String taskName, int priority) {
        this.taskName = taskName;
        this.priority = priority;
    }

    
    public String getTaskName() {
		return taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}



    public static void main(String[] args) {
        List<Task> taskList = new ArrayList<Task>();

        // Adding tasks to the list
        taskList.add(new Task("Task 1", 3));
        taskList.add(new Task("Task 2", 1));
        taskList.add(new Task("Task 3", 2));

        // Accessing task details
        for (Task task : taskList) {
            System.out.println("Task Name: " + task.taskName);
            System.out.println("Priority: " + task.priority);
            System.out.println();
        }
    }
}
