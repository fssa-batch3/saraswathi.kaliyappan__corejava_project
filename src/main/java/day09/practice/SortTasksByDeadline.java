package day09.practice;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Task {
    private int id;
    private String name;
    private LocalDate deadline;

    public Task(int id, String name, LocalDate deadline) {
        this.id = id;
        this.name = name;
        this.deadline = deadline;
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
}

public class SortTasksByDeadline {

    public static void main(String[] args) {
        ArrayList<Task> tasksList = new ArrayList<>();
        tasksList.add(new Task(3, "Coding", LocalDate.parse("2022-10-22")));
        tasksList.add(new Task(5, "Product Design", LocalDate.parse("2022-10-01")));
        tasksList.add(new Task(1, "Software Design", LocalDate.parse("2022-10-07")));
        tasksList.add(new Task(3, "Coding", LocalDate.parse("2022-10-22"))); // Duplicate entry in the sample input

        Collections.sort(tasksList, Comparator.comparing(Task::getDeadline));

        System.out.println("Sorted Tasks by Deadline:");
        for (Task task : tasksList) {
            System.out.println(task.getId() + "," + task.getName() + "," + task.getDeadline());
        }
    }
}
