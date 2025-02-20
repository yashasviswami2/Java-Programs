package com.company;

interface Bicycle{
    int a = 45;
    void applyBrake(int decrement);
    void speedUp(int increment);
}
class HeroCycle implements Bicycle{
    void blowHorn(){
        System.out.println("Pee Pee Poo Poo");
    }
    public void applyBrake(int decrement){
        System.out.println("Applying brake");
    }
    public void speedUp(int increment){
        System.out.println("Applying speedUp");
    }
}
public class cwh_54_interfaces
{
    public static void main(String[] args) {
        HeroCycle cycleYashasvi = new HeroCycle();
        cycleYashasvi.applyBrake(1);

    }
}
