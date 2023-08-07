package practice;


class Main {
public double calculateArea(double radius) {
   return Math.PI * radius * radius;
}
		
public double calculateArea(double length, double width) {
   return length * width;
}
}

public class ShapCalculate {
public static void main(String[] args) {
	 Main calculator = new Main();
   double circleArea = calculator.calculateArea(3.5);                     
   double rectangleArea = calculator.calculateArea(4.2, 6.8);            
   
   System.out.println(circleArea);
   System.out.println(rectangleArea);
}
}

