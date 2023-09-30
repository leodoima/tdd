package main.cap1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarsTest {


    @Test
    @DisplayName("Listagem de nome do objeto contido na lista")
    public void shouldNameCarInsertIntoList() {
        Cars car = new Cars("Corsa", 1994);
        car.addCar();

        assertFalse(Cars.listCars.isEmpty());
    }

    @Test
    @DisplayName("Listagem do ano do objeto contido na lista")
    public void shouldYearCarInsertIntoList() {
        Cars car = new Cars("Corsa", 1994);
        Cars.listCars.add(car);

        assertEquals(1994, Cars.listCars.get(0).getYear());
    }

    @Test
    @DisplayName("Validando status de lista quando não possui registros")
    public void shouldZeroBecauseNotCarInList() {
        assertTrue(Cars.listCars.isEmpty());
    }
}