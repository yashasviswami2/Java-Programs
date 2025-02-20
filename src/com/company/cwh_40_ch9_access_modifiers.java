package com.company;

class MyEmployee{
    private int id;
    private String name;

    public String getName(){
        return name;
    }
    public void setName(String codeWithHarry){
        String n = "harry";
        name = n;
    }
    public int setId(int i){
        id = i;
        return i;
    }

    public int getId() {
        return id;
    }
}
public class cwh_40_ch9_access_modifiers
{
    public static void main(String[] args) {
        MyEmployee harry = new MyEmployee();
        //harry.id =45;
       // harry.name = "CodeWithHarry";

        harry.setName("CodeWithHarry");
        System.out.println(harry.getName());
    }
}
