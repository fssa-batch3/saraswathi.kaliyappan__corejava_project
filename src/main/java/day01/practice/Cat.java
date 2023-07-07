package day01.practice;

public class Cat {

	private String color;

	private String age;
	private String speaks;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getSpeaks() {
		return speaks;
	}

	public void setSpeaks(String speaks) {
		this.speaks = speaks;
	}

	public static void main(String[] args) {

		Cat cat1 = new Cat();
		cat1.setAge("4");
		cat1.setColor("White");
		cat1.setSpeaks("Meow!");

		Cat cat2 = new Cat();
		cat2.setAge("3");
		cat2.setColor("White");
		cat2.setSpeaks("Meow!");

		System.out.println("cat 1:");
		System.out.println("Age: " + cat1.getAge());
		System.out.println("Color: " + cat1.getColor());
		System.out.println("Speaks: " + cat1.getSpeaks());

		System.out.println("cat 2:");
		System.out.println("Age: " + cat2.getAge());
		System.out.println("Color: " + cat2.getColor());
		System.out.println("Speaks: " + cat2.getSpeaks());
	}
}