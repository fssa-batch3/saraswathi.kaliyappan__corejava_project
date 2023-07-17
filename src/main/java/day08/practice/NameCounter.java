package day08.practice;

import java.util.*;

public class NameCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String input = scanner.nextLine();

        String[] names = input.split(",s*");
        Map<String, Integer> nameCountMap = new HashMap<>();

        for (String name : names) {
            nameCountMap.put(name, nameCountMap.getOrDefault(name, 0) + 1);
        }

        for (Map.Entry<String, Integer> entry : nameCountMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}

