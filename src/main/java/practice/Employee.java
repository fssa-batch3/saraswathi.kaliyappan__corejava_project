package practice;


class Employee {
    private int id;
    private String name;
    
    public Employee(int id,String name) {
    	this.id = id;
    	this.name = name;
    	
    }
}
class TestEmployee{
	public static void main(String[] args) {
		Employee e1 = new Employee(1,"raj");
		Employee e2 = new Employee(2,"varun");
	}
}