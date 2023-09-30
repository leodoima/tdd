package main.cap1;

import java.util.ArrayList;
import java.util.List;

public class Cars {

    public static List<Cars> listCars = new ArrayList<>();

    private String name;
    private int year;

    public Cars(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void addCar(){
        listCars.add(this);
    }
}
