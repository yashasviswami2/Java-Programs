package com.company;

class MyMainEmployee{
    private int id;
    private String name;

    public MyMainEmployee(){
        id = 45;
        name = "Yashasvi";
    }

    public String getName(){return name; }
    public void setName(String n) {this.name = n; }
    public void setId(int i) {this.id = i; }
    public int getId() { return id; }
}
public class cwh_42_constructors
{
    public static void main(String[] args) {
        MyMainEmployee harry = new MyMainEmployee();
        harry.setName("CodeWithHarry");
        harry.setId(36);
        System.out.println(harry.getId());
        System.out.println(harry.getName());
    }
}
