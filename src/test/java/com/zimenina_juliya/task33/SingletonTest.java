package com.zimenina_juliya.task33;

import org.junit.Test;
import com.zimenina_juliya.task33.task1.Singleton;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class SingletonTest {

    @Test
    public void getInstance() {
        Singleton singleton = mock(Singleton.class);
        when(singleton.getTestWord()).thenReturn("C");
    }
}