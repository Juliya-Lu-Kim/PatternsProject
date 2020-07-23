package com.zimenina_juliya.task33.task1;
/*
Задание 1
Создайте классическую реализацию паттерна com.zimenina_juliya.task33.task1.Singleton.
Протестируйте работу созданного класса.
 */

// Реализация паттерна com.zimenina_juliya.task33.task1.Singleton для однопоточного приложения

public class Singleton {

    // переменные класса

    private static Singleton instance;
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

    public Singleton() {
    }

    // возвращаемый метод для паттерна
    public static Singleton getInstance(){
        if (instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}
