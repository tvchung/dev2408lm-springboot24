package com.devmaster.lesson01.pkg_defaultmethod;

public interface Interface1 {
    default void method1() {
        System.out.println("Interface1.method1");
    }
}
