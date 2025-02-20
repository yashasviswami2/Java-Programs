package com.company;

 class MyNewThr1 extends Thread{
     public void run(){
         while(true){
             System.out.println("Thank you: ");
         }
     }
 }
 class MyNewThr2 extends Thread{
     public void run(){
     while(true){


         System.out.println("Thank you: ");}
 }}
public class cwh_75_thread_methods
{
    public static void main(String[] args) throws InterruptedException {
        MyNewThr1 t1 = new MyNewThr1();
        MyNewThr2 t2 = new MyNewThr2();
        t1.start();
        try{
            t1.join();
        }
        catch (Exception e){
            System.out.println(e);
        }
        t2.start();
    }
}
