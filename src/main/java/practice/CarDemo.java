package practice;

import practice.Car;

class Car {

	private int speed = 0;
	private int gear = 1;

	public void changeGear(int newValue) {
		gear = newValue;
	}

	public void speedUp(int increment) {
		speed = speed + increment;
	}

	public void applyBrakes(int decrement) {
		speed = speed - decrement;
	}

	public void printStates() {
		System.out.println(" speed:" + speed + " gear:" + gear);
	}
}


public class CarDemo {
	public static void main(String[] args) {

		
		Car car1 = new Car();
	
		car1.speedUp(10);
		car1.changeGear(2);
		car1.printStates();

		Car car2 = new Car();

		car2.speedUp(10);
		car2.changeGear(2);
		car2.speedUp(10);
		car2.changeGear(3);
		car2.printStates();
	}
}
