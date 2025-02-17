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
public class CanPlaceFlowersTest {

    CanPlaceFlowers instance = new CanPlaceFlowers();

    @Test
    public void testCase1() {
        int[] flowerbed = {1, 0, 0, 0, 1};
        int n = 1;
        boolean expResult = true;
        boolean result = instance.canPlaceFlowers(flowerbed, n);
        assertEquals(expResult, result);
    }

    @Test
    public void testCase2() {
        int[] flowerbed = {1, 0, 0, 0, 1};
        int n = 2;
        boolean expResult = false;
        boolean result = instance.canPlaceFlowers(flowerbed, n);
        assertEquals(expResult, result);
    }

    @Test
    public void testCase3() {
        int[] flowerbed = {1, 0, 1, 0, 1, 0, 1};
        int n = 0;
        boolean expResult = true;
        boolean result = instance.canPlaceFlowers(flowerbed, n);
        assertEquals(expResult, result);
    }

}
