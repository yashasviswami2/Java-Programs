package com.company;

class One{
    public void greet(){
        System.out.println("Good Morning");
    }
    public void name(){
        System.out.println("My name is Java.");
    }
}
class Two extends One{
    public void swagat(){
        System.out.println("Aapka swagat hai.");
    }
    public void name(){
        System.out.println("My name is java in class two.");
    }
}
public class cwh_49_dynamic_method_dispatch
{
    public static void main(String[] args) {
        One obj = new One();
        obj.name();
    }
}
