package com.zimenina_juliya.task33.task2;

/*
Задание 2
Измените созданный в первом задании класс, так
чтобы он поддерживал многопоточность.
 */

public class Run {
    public static void main(String[] args) {
        SingletonForMultithreading singleton1 = SingletonForMultithreading.getInstance();
        SingletonForMultithreading singleton2 = SingletonForMultithreading.getInstance();
        SingletonForMultithreading singleton3 = SingletonForMultithreading.getInstance();

        singleton1.setTestWord("D");
        System.out.println("First data singleton: ");
        System.out.println(singleton1.getTestWord());
        System.out.println();

        singleton2.setTestWord("F");
        System.out.println("Second data singleton: ");
        System.out.println(singleton1.getTestWord());
        System.out.println(singleton2.getTestWord());
        System.out.println();


        singleton3.setTestWord("G");
        System.out.println("Third data singleton: ");
        System.out.println(singleton1.getTestWord());
        System.out.println(singleton2.getTestWord());
        System.out.println(singleton3.getTestWord());

    }
}
