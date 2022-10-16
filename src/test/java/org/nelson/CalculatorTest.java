package org.nelson;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CalculatorTest {

    @Test
    @DisplayName("Add two numbers")
    void add() {
        assertEquals(4,Calculator.add(2,2));
    }

    @Test
    @DisplayName("Multiply two numbers")
    void product() {
        assertAll(()->assertEquals(16,Calculator.product(4,4)),
                ()->assertEquals(-4,Calculator.product(2,-2)),
                ()->assertEquals(9,Calculator.product(3,3)));
    }
    @Test
    @DisplayName("Difference of two numbers")
    void difference(){
        assertAll(()->assertEquals(5,Calculator.difference(8,3)),
                ()->assertEquals(4,Calculator.difference(8,4))
        );
    }
}