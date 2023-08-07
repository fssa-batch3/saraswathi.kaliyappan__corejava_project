package practice;

import practice.Animal1;
import practice.Lion1;

public class Animal1 {
	private int age;
	private String name;
	
	public Animal1(String name) {
		System.out.println("Calling Parent Constructor");
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}

class Lion1 extends Animal1 {

	public Lion1(String name) {
		super(name);		
		System.out.println("Calling Child Constructor");
	}

	private void roar() {
		System.out.println("The " + getAge() + " year old " + getName() + " says: Roar!");
	}

	public static void main(String[] args) {
		Lion1 simba = new Lion1("Simba");
		simba.setAge(10); 
		simba.roar();
	}
}
