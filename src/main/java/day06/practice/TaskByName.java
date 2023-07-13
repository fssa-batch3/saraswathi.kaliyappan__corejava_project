package day06.practice;

import java.util.ArrayList;

public class TaskByName {
    public String taskName;
    public int priority;

    public TaskByName(String taskName, int priority) {
        this.taskName = taskName;
        this.priority = priority;
    }

    public static void main(String[] args) {
        ArrayList<Task> tasks = new ArrayList<Task>();
        tasks.add(new Task("Task 1", 3));
        tasks.add(new Task("Task 2", 1));
        tasks.add(new Task("Task 3", 2));

        boolean taskFound = findTaskByName("Task 2", tasks);
        System.out.println("Task Found: " + taskFound);
    }

    public static boolean findTaskByName(String name, ArrayList<Task> tasks) {
        for (Task task : tasks) {
            if (task.taskName.equals(name)) {
                return true; 
            }
        }
        return false; 
    }
}
