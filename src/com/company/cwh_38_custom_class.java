package com.company;

class Employee{
    int id;
    String name;
    public void printDetails(){
        System.out.println("My id is "+ id);
        System.out.println("And my name is" + name);
    }
}
public class cwh_38_custom_class
{
    public static void main(String[] args) {
        System.out.println("This is our custom class.");
        Employee harry = new Employee();
        Employee john = new Employee();

        harry.id = 12;
        harry.name = "CodeWithHarry";

        john.id = 17;
        john.name = "John tiwari";

        harry.printDetails();
        john.printDetails();
//        System.out.println(harry.id);
//        System.out.println(harry.name);
    }
}
