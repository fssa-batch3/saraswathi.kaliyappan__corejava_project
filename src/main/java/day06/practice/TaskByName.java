
package day06.practice;


import java.util.ArrayList;


class Task1 {
	
	 private String name;
	 
	    public Task1(String name) {
	        this.name = name;
	    }
	    public String getName() {
	        return name;
	    }
}

public class TaskByName {
   public static void main(String[] args) throws Exception  {
	   ArrayList<Task1> tasks = new ArrayList<>();
       tasks.add(new Task1("wakeUp"));
       tasks.add(new Task1("Exercise"));
       tasks.add(new Task1("Cleaning"));
       
       boolean find = findTaskName("Exercise", tasks);
       System.out.println("Task Status : " + find);
   }
   public static  boolean findTaskName(String name, ArrayList<Task1> tasks) throws Exception {
       for (Task1 task : tasks) {
           if (task.getName().equals(name)) {
               return true;
           }
       }
       throw new Exception("Task Not found");
}
}
