package com.zimenina_juliya.task33.task3;

public class PastaLasanga implements Pasta {
    @Override
    public void namePasta() {
        System.out.println("Лазанья");
    }

    @Override
    public void typePasta() {
        System.out.println("Тип пасты: Лазанья");
    }

    @Override
    public void sauce() {
        System.out.println("Соус: Болоньезе, Бешамель");
    }

    @Override
    public void stuffing() {
        System.out.println("Начинка: Мясной фарш");

    }

    @Override
    public void additive() {
        System.out.println("Добаки:");
        System.out.println("1. Грибы");
        System.out.println("2. Пармезан (тертый)");

    }

    @Override
    public void makePasta() {
        this.namePasta();
        this.typePasta();
        this.sauce();
        this.stuffing();
        this.additive();

    }
}
