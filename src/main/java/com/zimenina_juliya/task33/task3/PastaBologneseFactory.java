package com.zimenina_juliya.task33.task3;

public class PastaBologneseFactory implements PastaFactory {
    @Override
    public Pasta createPasta() {
        return new PastaBolognese();
    }
}
