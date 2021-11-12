package com.example.springpatterns.behavioral.observer;

import com.example.springpatterns.behavioral.observer.*;
import com.example.springpatterns.patterns.behavioral.observer.SmartPhone;
import com.example.springpatterns.patterns.behavioral.observer.Weather;
import com.example.springpatterns.patterns.behavioral.observer.WeatherObserver;
import com.example.springpatterns.patterns.behavioral.observer.WeatherType;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SmartPhoneTest {

    @BeforeEach
    void setUp() {
        System.out.println("Iniciando test de Computer");
    }


    @AfterEach
    void tearDown() {
        System.out.println("Finalizando test de Computer");
    }

    @Test
    void updateTest() {
        WeatherObserver smartphone = new SmartPhone();
        Weather weather = new Weather();
        smartphone.update(WeatherType.SUNNY);
        weather.addObserver(smartphone);
        smartphone.update(WeatherType.CLOUDY);
        assertNotNull(WeatherType.CLOUDY,"Smartphone has been notified of weather change: " );

    }
}
