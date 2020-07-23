package com.zimenina_juliya.task33.task3;

public class PastaLasangaFactory implements PastaFactory {
    @Override
    public Pasta createPasta() {
        return new PastaLasanga();
    }
}
