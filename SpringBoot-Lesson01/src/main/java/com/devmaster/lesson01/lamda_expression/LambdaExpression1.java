package com.devmaster.lesson01.lamda_expression;

@FunctionalInterface
interface SayHello1{
    void sayHello();
}

interface SayHello2{
    void sayHello(String name);
}

public class LambdaExpression1 {
    public static void main(String[] args) {
        // Khong tham so
        SayHello1 sayHello = () -> {
            System.out.println("Hello World");
        };
        sayHello.sayHello();

        // Co mot tham so
        SayHello2 say1 = (name)->{
            System.out.println("Hello "+name);
        };
        say1.sayHello("Devamster");
        SayHello2 say2 = name ->{
            System.out.println("Hello "+name);
        };
        say2.sayHello("Devmaster Academy");

        SayHello2 say3 = name -> System.out.println("Hello "+name);
        say3.sayHello("Devmaster Academy");


    }
}
