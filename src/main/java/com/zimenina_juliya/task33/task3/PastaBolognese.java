package com.zimenina_juliya.task33.task3;

public class PastaBolognese implements Pasta {
    @Override
    public void namePasta() {
        System.out.println("Болоньезе");
    }

    @Override
    public void typePasta() {
        System.out.println("Тип пасты: Спагетти");
    }

    @Override
    public void sauce() {
        System.out.println("Соус: Болоньезе");

    }

    @Override
    public void stuffing() {
        System.out.println("Начинки: Мясной фарш");

    }

    @Override
    public void additive() {
        System.out.println("Добавки: ");
        System.out.println("1. Пармезан (тертый)");
        System.out.println("2. Базилик (свежий)");

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
