package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void isEven() {
        //GIVEN -> Bekannten Werte / Vorbereitung
        int i = 2;
        boolean expected = true;
        //WHEN -> Tatsächliche Methodenaufruf
        boolean actual = Main.isEven(i);
        //THEN -> eigentlicher Test => Vergleich von Erwartung und Realität
        assertEquals(expected, actual);
    }
}