package com.company;

class MythreadRunnable implements Runnable{
    public void run(){
        System.out.println("I am a thread not a threat");
    }
}
class MythreadRunnable2 implements Runnable{
    public void run(){
        System.out.println("I am a thread 2 not a threat 2");
    }
}
public class cwh_71_runnable
{
    public static void main(String[] args) {
        MythreadRunnable t1 = new MythreadRunnable();
        Runnable bullet1 = null;
        Thread gun1 = new Thread(bullet1);

        MythreadRunnable2 t2 = new MythreadRunnable2();
        Runnable bullet2 = null;
        Thread gun2 = new Thread(bullet2);

        gun1.start();
        gun2.start();
    }
}
