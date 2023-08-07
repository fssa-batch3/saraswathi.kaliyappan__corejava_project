package practice;


import java.util.HashMap;

public class ModifyingAHashMapDemo {
	public static void main(String[] args) {

		HashMap<String, Integer> deptMap = new HashMap<String, Integer>();
		deptMap.put("HR", 5);
		deptMap.put("ADMIN", 10);
		deptMap.put("DEVELOPERS", 300);


		int hrCount = deptMap.get("HR");
		hrCount += 1;
		deptMap.put("HR", hrCount);

		
		for (String deptName : deptMap.keySet()) {

			Integer count = deptMap.get(deptName);
			System.out.println("Department Name:" + deptName + " and Employee Count :" + count);

		}
	}
}
