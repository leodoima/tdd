package main.cap1;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarsTest {

    private Cars car;

    @BeforeEach
    public void init() {
        this.car = new Cars("Corsa", 1994);
    }


    @Test
    @DisplayName("Listagem de nome do objeto contido na lista")
    public void shouldNameAndYearCarInsertIntoList() {
        this.car.addCar();

        assertEquals("Corsa", Cars.listCars.get(0).getName());
        assertEquals(1994, Cars.listCars.get(0).getYear());
    }

    @Test
    @DisplayName("Validar conteúdo vazio da lista de carros")
    public void shouldFalseWhenListIsEmpty() {
        assertFalse(Cars.listCars.isEmpty());
    }
}