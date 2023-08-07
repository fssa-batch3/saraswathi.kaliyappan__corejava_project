package practice;

public class Person {
   private String name;
   private int age;
   
   public String getname() {
	   return name;
   }
   public void setname(String name) {
	   this.name = name;
   }
   public int getage() {
	   return age;
   }
   public void setage(int age) {
	   this.age = age;
   }
   
   
   public static void main(String[] args) {
	   Person person = new Person();
	   person.setname("Arul");
	   person.setage(29);
	   
	   String name = person.getname();
	   int age = person.getage();
	   
	   System.out.println(name);
	   System.out.println(age);
}
}
