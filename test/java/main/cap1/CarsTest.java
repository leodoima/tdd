package main.cap1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarsTest {


    @Test
    public void shouldNameCarInsertIntoList() {
        Cars car = new Cars("Corsa", 1994);
        car.addCar();

        assertFalse(Cars.listCars.isEmpty());
    }

    @Test
    public void shouldYearCarInsertIntoList() {
        Cars car = new Cars("Corsa", 1994);
        Cars.listCars.add(car);

        assertEquals(1994, Cars.listCars.get(0).getYear());
    }

    @Test
    public void shouldZeroBecauseNotCarInList() {
        assertTrue(Cars.listCars.isEmpty());
    }
}