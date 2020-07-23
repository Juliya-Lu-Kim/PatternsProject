package com.zimenina_juliya.task33.task1;/*
Задание 1
Создайте классическую реализацию паттерна com.zimenina_juliya.task33.task1.Singleton.
Протестируйте работу созданного класса.
 */


public class Run {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        Singleton singleton3 = Singleton.getInstance();



        singleton1.setTestWord("A");
        System.out.println("First data singleton: ");
        System.out.println(singleton1.getTestWord());
        System.out.println();

        singleton2.setTestWord("B");
        System.out.println("Second data singleton: ");
        System.out.println(singleton1.getTestWord());
        System.out.println(singleton2.getTestWord());
        System.out.println();


        singleton3.setTestWord("C");
        System.out.println("Third data singleton: ");
        System.out.println(singleton1.getTestWord());
        System.out.println(singleton2.getTestWord());
        System.out.println(singleton3.getTestWord());



    }
}
