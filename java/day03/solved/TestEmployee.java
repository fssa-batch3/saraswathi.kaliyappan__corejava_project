package day03.solved;

class Employee {
	 
    private int id;
    private String name;
 
    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
        
        System.out.println("id ="+id+", " +"name ="+name);
    }
}


public class TestEmployee {
 
    public static void main(String[] args) {
        Employee e1 = new Employee(1, "naresh");
        Employee e2 = new Employee(2, "suresh");
    }
}