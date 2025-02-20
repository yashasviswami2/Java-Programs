package com.company;

class MyThr1 extends Thread{
    public MyThr1(String name){
        super(name);
    }
    public void run(){
        int i = 34;
        System.out.println("Thank you");
    }
}
public class cwh_74_thread_priorities
{
    public static void main(String[] args) {
        MyThr1 t1 = new MyThr1("yashu1");
        MyThr1 t2 = new MyThr1("yashu2");
        MyThr1 t3 = new MyThr1("yashu3");
        MyThr1 t4 = new MyThr1("yashu4");
        MyThr1 t5 = new MyThr1("yashu5");
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
