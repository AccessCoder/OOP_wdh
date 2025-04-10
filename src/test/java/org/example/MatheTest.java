package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MatheTest {

    @Test
    void add() {
        //GIVEN
        Mathe currywurst = new Mathe();
        int a = 2;
        int b = 3;
        int expected = a+b;
        //WHEN
        int actual = currywurst.add(a, b);
        //THEN
        assertEquals(expected, actual);

    }

    @Test
    void add_shouldReturn4_whenCalledWith2And2() {
        //GIVEN
        Mathe currywurst2 = new Mathe();
        int a2 = 2;
        int b2 = 3;
        int expected2 = 4;
        //WHEN
        int actual2 = currywurst2.add(a2, b2);
        //THEN
        assertEquals(expected2, actual2);
    }
}