package day08.practice;
	
import java.util.*;

public class DepartmentEmployeeMap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, List<String>> departmentEmployeeMap = new HashMap<>();

        System.out.println("Enter the input (DeptName, EmployeeName):");
        String input;
        while (!(input = scanner.nextLine()).isEmpty()) {
            String[] data = input.split(",\\s*");
            String departmentName = data[0].trim();
            String employeeName = data[1].trim();

            departmentEmployeeMap.putIfAbsent(departmentName, new ArrayList<>());
            departmentEmployeeMap.get(departmentName).add(employeeName);
        }

        for (Map.Entry<String, List<String>> entry : departmentEmployeeMap.entrySet()) {
            String departmentName = entry.getKey();
            List<String> employees = entry.getValue();
            System.out.println(departmentName + ": " + String.join(", ", employees));
        }
    }
}

