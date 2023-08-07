package practice;

import practice.MyClass;

public class MyClass {
    public static int staticVariable = 10;
    public int instanceVariable = 10;

    public static void main(String[] args) {
        MyClass obj1 = new MyClass();
        obj1.staticVariable += 1;
        obj1.instanceVariable += 1;
        System.out.println("Static variable obj1: " + obj1.staticVariable);
        System.out.println("Instance variable obj1: " + obj1.instanceVariable);
        
        
        MyClass obj2 = new MyClass();
        obj2.staticVariable += 1;
        obj2.instanceVariable += 1;
 
        System.out.println("Static variable obj2: " + obj2.staticVariable);
        System.out.println("Instance variable obj2: " + obj2.instanceVariable);
        
    }
}