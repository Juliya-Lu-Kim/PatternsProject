package com.zimenina_juliya.task33.task3;

public class PastaCarbonara implements Pasta {
    @Override
    public void namePasta() {
        System.out.println("Карбонара");
    }

    @Override
    public void typePasta() {
        System.out.println("Тип пасты: Спагетти");
    }

    @Override
    public void sauce() {
        System.out.println("Соус: Карбонара");

    }

    @Override
    public void stuffing() {
        System.out.println("Начинка:");
        System.out.println("1. Бекон");
        System.out.println("2. Лосось");

    }

    @Override
    public void additive() {
        System.out.println("Добавки: Пармезан (тертый)");
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
