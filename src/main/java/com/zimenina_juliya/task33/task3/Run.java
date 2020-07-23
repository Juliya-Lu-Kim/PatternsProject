package com.zimenina_juliya.task33.task3;

/*
Задание 4
Создайте приложение для приготовления пасты.
Приложение должно уметь создавать минимум три вида
пасты. Классы различной пасты должны иметь следую-
щие методы:
Тип пасты;
Соус;
Начинка;
Добавки.
Для реализации используйте порождающие паттерны.
 */

public class Run {
    public static void main(String[] args) {
        PastaFactory pastaFactory = configure("Карбонара");
        Pasta pasta = pastaFactory.createPasta();
        pasta.makePasta();

//        System.out.println();
//        pastaFactory = configure("Болоньезе");
//        pasta = pastaFactory.createPasta();
//        pasta.makePasta();


//        System.out.println();
//        pastaFactory = configure("Альфредо");
//        pasta = pastaFactory.createPasta();
//        pasta.makePasta();


//        System.out.println();
//        pastaFactory = configure("Лазанья");
//        pasta = pastaFactory.createPasta();
//        pasta.makePasta();


    }

    static PastaFactory configure(String pasta) {
        if (pasta.equals("Карбонара")) {
            return new PastaCarbonaraFactory();
        } else if (pasta.equals("Болоньезе")) {
            return new PastaBologneseFactory();
        } else if (pasta.equals("Альфредо")) {
            return new PastaAlfredoFactory();
        } else if (pasta.equals("Лазанья")){
            return new PastaLasangaFactory();
        }
        System.out.println("Данную пасту приготовить невозможно");
        return null;

    }
}

