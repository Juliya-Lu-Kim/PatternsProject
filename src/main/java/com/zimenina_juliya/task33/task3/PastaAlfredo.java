package com.zimenina_juliya.task33.task3;

public class PastaAlfredo implements Pasta {

    @Override
    public void namePasta() {
        System.out.println("Альфредо");
    }

    @Override
    public void typePasta() {
        System.out.println("Тип пасты: Фетучини");
    }

    @Override
    public void sauce() {
        System.out.println("Соус: Сливочный соус");

    }

    @Override
    public void stuffing() {
        System.out.println("Начинка: нет");

    }

    @Override
    public void additive() {
        System.out.println("Добавки: ");
        System.out.println("1. Курица");
        System.out.println("2. Грибы");
        System.out.println("3. Креветки");
        System.out.println("4. Пармезан (тертый)");

    }

    public void makePasta(){
        this.namePasta();
        this.typePasta();
        this.sauce();
        this.stuffing();
        this.additive();
    }
}
