package com.company;

interface MyCamera2{
    void takeSnap();
    void recordVideo();
    private void greet(){
        System.out.println("Good Morning.");
    }
    default void record4KVideo(){
        greet();
        System.out.println("Recording in 4K...");
    }
}

interface MyWifi2{
    String[] getNetworks();
    void connectToNetwork(String network);
}
public class cwh_59_polymorphism {
}
