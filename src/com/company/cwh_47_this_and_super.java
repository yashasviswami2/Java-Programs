package com.company;

class EkClass{
    int a;
    EkClass(int v){
        a = v;
    }
    public int returnone(){
        return 1;
    }

    public boolean getA() {
        return false;
    }
}
public class cwh_47_this_and_super
{
    public static void main(String[] args) {
        EkClass e = new EkClass(5);
        System.out.println(e.getA());
    }
}
