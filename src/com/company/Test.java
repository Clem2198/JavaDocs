package com.company;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Test {

    @org.junit.Test
    public void additionUnitTestTrue() {
        try {
            assertTrue(Main.addition(5, 5) == 10);
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }

    @org.junit.Test
    public void additionUnitTestFalse() {
        try {
            assertFalse(Main.addition(5, 5) == 7);
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }

    @org.junit.Test
    public void subtractionUnitTestTrue() {
        try {
            assertTrue(Main.subtraction(7, 3) == 4);
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }

    @org.junit.Test
    public void subtractionUnitTestFalse() {
        try {
            assertFalse(Main.subtraction(7, 3) == 5);
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }

    @org.junit.Test
    public void multiplicationUnitTestTrue() {
        try {
            assertTrue(Main.multiplication(5, 5) == 25);
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }

    @org.junit.Test
    public void multiplicationUnitTestFalse() {
        try {
            assertFalse(Main.multiplication(4, 3) == 11);
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }

    @org.junit.Test
    public void divisionUnitTestTrue() {
        try {
            assertTrue(Main.division(6, 3) == 2);
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }

    @org.junit.Test
    public void divisionUnitTestFalse() {
        try {
            assertFalse(Main.division(6, 2) == 2);
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
