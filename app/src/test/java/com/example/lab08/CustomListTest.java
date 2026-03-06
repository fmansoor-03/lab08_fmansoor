package com.example.lab08;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class CustomListTest {
    @Test
    public void testHasCity() {
        CustomList list = new CustomList();
        City calgary = new City("Calgary", "AB");
        list.addCity(calgary);
        assertTrue(list.hasCity(calgary));
    }

    @Test
    public void testDeleteCity() {
        CustomList list = new CustomList();
        City calgary = new City("Calgary", "AB");
        City edmonton = new City("Edmonton", "AB");
        list.addCity(calgary);
        list.addCity(edmonton);
        list.deleteCity(calgary);
        assertFalse(list.hasCity(calgary));
        assertTrue(list.hasCity(edmonton));
    }

    @Test
    public void testCountCities() {
        CustomList list = new CustomList();
        City calgary = new City("Calgary", "AB");
        City edmonton = new City("Edmonton", "AB");
        City vancouver = new City("Vancouver", "BC");

        assertEquals(0, list.countCities());
        list.addCity(calgary);
        assertEquals(1, list.countCities());
        list.addCity(edmonton);
        list.addCity(vancouver);
        assertEquals(3, list.countCities());
        list.deleteCity(calgary);
        assertEquals(2, list.countCities());
    }
}
