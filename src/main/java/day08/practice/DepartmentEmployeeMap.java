package day08.practice;
	
//Practice problem
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class DepartmentEmployeeMap {

	public static String printEmpNameByDept(List<String> inputLines) {
		
		// Validating your method arguments
		if(inputLines == null || inputLines.size() == 0) {
			return "";
		}
		Map<String, List<String>> departmentEmployeeMap = new TreeMap<String, List<String>>();

		// Creating a Treemap of Deptname, List of EmployeeNames.
		for (String input : inputLines) {
			String[] parts = input.split(",");
			String department = parts[0].trim();
			String employee = parts[1].trim();
			if (departmentEmployeeMap.containsKey(department)) {// IT
				List<String> employees = departmentEmployeeMap.get(department);
				employees.add(employee);
			} else {
				List<String> employees = new ArrayList<String>();
				employees.add(employee);// ARAVIND ADD
				departmentEmployeeMap.put(department, employees);// IT: ARAVIND
			}
		}

		StringBuilder outputString = new StringBuilder("");

		for (String department : departmentEmployeeMap.keySet()) {
			List<String> employees = departmentEmployeeMap.get(department);
			Collections.sort(employees);

			outputString.append(department + ":");

			for (int i = 0; i < employees.size(); i++) {
				outputString.append(employees.get(i));
				if (i != employees.size() - 1) {
					outputString.append(",");
				}
			}

			outputString.append(System.lineSeparator());
		}

		return outputString.toString();
	}

	public static void main(String[] args) {


		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter department name and employee name type exit to stop the loop:");
		String input = scanner.nextLine();
		List<String> inputLines = new ArrayList<String>();

		while (!input.equalsIgnoreCase("exit")) {
			inputLines.add(input);
			input = scanner.nextLine();
		}

		scanner.close();
		System.out.println(printEmpNameByDept(inputLines));

	}
}