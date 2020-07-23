package com.zimenina_juliya.task33.task2;

/*
Задание 2
Измените созданный в первом задании класс, так
чтобы он поддерживал многопоточность.
 */

// реализация паттерна для многопоточного приложения

public class SingletonForMultithreading {
    // переменные класса

    private static volatile SingletonForMultithreading instance;

    private String testWord;

    //получение тестового слова, для вывода на консоль
    public String getTestWord() {
        return testWord;
    }

    // ввод тестового слова
    public void setTestWord(String testWord) {
        this.testWord = testWord;
    }

    // конструктор для паттерна


    private SingletonForMultithreading() {
    }

    // возвращаемый метод для паттерна
    public static SingletonForMultithreading getInstance(){
        if (instance == null)
            synchronized (SingletonForMultithreading.class){
                if (instance == null)
                    instance = new SingletonForMultithreading();
            }
        return instance;
    }

}

