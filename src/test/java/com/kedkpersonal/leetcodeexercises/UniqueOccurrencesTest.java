/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.kedkpersonal.leetcodeexercises;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author kedk
 */
public class UniqueOccurrencesTest {

    UniqueOccurrences instance = new UniqueOccurrences();

    @Test
    public void testUniqueOccurrences() {
        int[] arr = {1, 2, 1, 2, 3};
        boolean expResult = false;
        boolean result = instance.uniqueOccurrences(arr);
        assertEquals(expResult, result);
    }

    @Test
    public void testUniqueOccurrencesCase1() {
        int[] arr = {1, 2, 2, 1, 1, 3};
        boolean expResult = true;
        boolean result = instance.uniqueOccurrences(arr);
        assertEquals(expResult, result);
    }

    @Test
    public void testUniqueOccurrencesCase2() {
        int[] arr = {1, 2};
        boolean expResult = false;
        boolean result = instance.uniqueOccurrences(arr);
        assertEquals(expResult, result);
    }

    @Test
    public void testUniqueOccurrencesCase3() {
        int[] arr = {-3, 0, 1, -3, 1, 1, 1, -3, 10, 0};
        boolean expResult = true;
        boolean result = instance.uniqueOccurrences(arr);
        assertEquals(expResult, result);
    }

}
