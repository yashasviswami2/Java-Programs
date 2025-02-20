package com.company;

class Mythr extends Thread{
    public Mythr(String name){
        super(name);
    }
    public void run(){
        while (true){
            System.out.println("I am a thread");
        }
    }
}
public class cwh_73_thread_constructor
{
    public static void main(String[] args) {
        Mythr t = new Mythr("yashu");
        t.start();
        System.out.println("The id of the thread t is " + t.getId());


    }
}
