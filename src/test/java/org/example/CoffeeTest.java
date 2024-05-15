package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CoffeeTest {
    @Test
    void test_isEmpty_when_coffee_isEmpty_then_returns_empty() {
        Coffee coffee = new Coffee(true);
        Assertions.assertTrue(coffee.isEmpty());
    }

    @Test
    void test_isEmpty_when_coffee_isNot_then_returns_not_Empty() {
        Coffee coffee = new Coffee(false);
        Assertions.assertFalse(coffee.isEmpty());
    }

    @Test
    void test_isEmpty_when_coffee_initialized_without_parameter_then_returns_returns_Empty() {
        Coffee coffee = new Coffee();
        Assertions.assertFalse(coffee.isEmpty());
    }

    @Test
    void test_fill_when_coffee_isEmpty_then_coffee_will_be_filled() {
        Coffee coffee = new Coffee(true);
        coffee.fill();
        Assertions.assertFalse(coffee.isEmpty());
    }

    @Test
    void test_fill_when_coffee_isNotEmpty_then_throws_coffeeFullException() {
        Coffee coffee = new Coffee(false);
        Assertions.assertThrowsExactly(CoffeeFullException.class,()->coffee.fill());
    }
    @Test
    void test_drink_when_coffee_isEmpty_then_throws_coffeeFullException() {
        Coffee coffee = new Coffee(true);
        Assertions.assertThrowsExactly(CoffeeEmptyException.class,()->coffee.drink());
    }
}
