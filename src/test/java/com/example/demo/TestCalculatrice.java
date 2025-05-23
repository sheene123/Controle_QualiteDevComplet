package com.example.demo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestCalculatrice {

    Calculatrice calc = new Calculatrice();

    @Test
    public void TestAddition() {
        assertEquals(5.0f, calc.add(2.0f, 3.0f));
        assertEquals(-1.0f, calc.add(2.0f, -3.0f));
    }

    @Test
    public void TestMultiplication() {
        assertEquals(6.0f, calc.mult(2.0f, 3.0f));
        assertEquals(0.0f, calc.mult(5.0f, 0.0f));
    }

    @Test
    public void TestDivision() {
        assertEquals(2.0f, calc.div(6.0f, 3.0f));
        assertEquals(-2.5f, calc.div(5.0f, -2.0f));
    }

    @Test
    public void testDivisionParZeroException() {
        Exception exception = assertThrows(ArithmeticException.class, () -> {
            calc.div(10.0f, 0.0f);
        });
        assertEquals("Division par O", exception.getMessage());
    }

    @Test
    public void minusTest() {
        assertEquals(2.0f, calc.minus(5.0f, 3.0f));
        assertEquals(-8.0f, calc.minus(-5.0f, 3.0f));
        assertEquals(0.0f, calc.minus(4.5f, 4.5f));
    }


    @Test
    public float minus(float operande1, float operande2) {

        float Operande1 = operande1;
        float Operande2 = operande2;

        return assertEquals(5.0f, calc.minus(Operande1, Operande2));
    }

}

