package main.cap7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DeveloperTest {

    @Test
    public void sholdMinimalTaxForDeveloperSalary() {
        Developer johnDoe = new Developer("John Doe", 2500);
        assertEquals(375.0, johnDoe.calculateTax());
    }

    @Test
    public void shouldMaximumTaxForDeveloperSalary() {
        Developer johnDoe = new Developer("John Doe", 3001);
        assertEquals(750.25, johnDoe.calculateTax());
    }
}