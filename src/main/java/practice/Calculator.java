package practice;

public class Calculator {
      
	public int add (int a,int b) {
		return a+b;
	}
	public double add(double a,double b) {
		return a+b;
	}
	public String add(String a,String b) {
		return a+b;
	}
	
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		
//		calc.add(8, 10);
//		calc.add(30.4, 29.7);
//		calc.add("Hi", "Friends");
		
		
		System.out.println(calc.add(8, 10));
		System.out.println(calc.add(30.4, 29.7));
		System.out.println(calc.add("Hi", "Friends"));
	}
}
