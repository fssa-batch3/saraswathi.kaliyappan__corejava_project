package practice;

import practice.Animal;
import practice.Lion;

public class Animal {
	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
 class Lion extends Animal {  
	private void roar() {
		System.out.println("The " + getAge() + " year old lion says: Roar!");
	}

	public static void main(String[] args) {
		Lion simba = new Lion();
		simba.setAge(30);
		simba.roar();
	}
}