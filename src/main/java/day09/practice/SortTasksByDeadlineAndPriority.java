package day09.practice;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Task {
    private int id;
    private String name;
    private LocalDate deadline;
    private int priority;

    public Task(int id, String name, LocalDate deadline, int priority) {
        this.id = id;
        this.name = name;
        this.deadline = deadline;
        this.priority = priority;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public LocalDate getDeadline() {
        return deadline;
    }

    public int getPriority() {
        return priority;
    }
}

public class SortTasksByDeadlineAndPriority {

    public static void main(String[] args) {
        ArrayList<Task> tasksList = new ArrayList<>();
        tasksList.add(new Task(3, "Coding", LocalDate.parse("2022-10-22"), 2));
        tasksList.add(new Task(5, "Product Design", LocalDate.parse("2022-10-01"), 1));
        tasksList.add(new Task(1, "Software Design", LocalDate.parse("2022-10-07"), 3));
        tasksList.add(new Task(4, "Testing", LocalDate.parse("2022-10-22"), 2)); // Added another task with the same deadline and priority

        Collections.sort(tasksList, new TaskDeadlinePriorityComparator());

        System.out.println("Sorted Tasks by Deadline and Priority:");
        for (Task task : tasksList) {
            System.out.println(task.getId() + "," + task.getName() + "," + task.getDeadline() + "," + task.getPriority());
        }
    }
}

class TaskDeadlinePriorityComparator implements Comparator<Task> {
    @Override
    public int compare(Task task1, Task task2) {
        // Compare based on deadline first
        int deadlineComparison = task1.getDeadline().compareTo(task2.getDeadline());

        // If deadlines are the same, then compare based on priority
        if (deadlineComparison == 0) {
            return Integer.compare(task1.getPriority(), task2.getPriority());
        }

        return deadlineComparison;
    }
}
