package com.devmaster.lesson01.pkg_defaultmethod;

public class MultiInheristance implements Interface1, Interface2{
    @Override
    public  void  method1(){
        Interface1.super.method1();
    }

    public void method2(){
        System.out.println("MultiInheritance mehod2");
    }

    public void method3(){
        Interface2.super.method2();
    }

    public static void main(String[] args) {
        MultiInheristance mi = new MultiInheristance();
        mi.method1();
        mi.method2();
        mi.method3();
    }
}

