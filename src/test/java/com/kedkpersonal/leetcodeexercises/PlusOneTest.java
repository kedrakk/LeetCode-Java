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
public class PlusOneTest {

    PlusOne instance = new PlusOne();

//    @Test
//    public void testPlusOneCase1() {
//        int[] digits = {1, 2, 3};
//        int[] expResult = {1, 2, 4};
//        int[] result = instance.plusOne(digits);
//        assertArrayEquals(expResult, result);
//    }
//
//    @Test
//    public void testPlusOneCase2() {
//        int[] digits = {4, 3, 2, 1};
//        int[] expResult = {4, 3, 2, 2};
//        int[] result = instance.plusOne(digits);
//        assertArrayEquals(expResult, result);
//    }
//
//    @Test
//    public void testPlusOneCase3() {
//        int[] digits = {9};
//        int[] expResult = {1, 0};
//        int[] result = instance.plusOne(digits);
//        assertArrayEquals(expResult, result);
//    }
//
//    @Test
//    public void testPlusOneCase4() {
//        int[] digits = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
//        int[] expResult = {9, 8, 7, 6, 5, 4, 3, 2, 1, 1};
//        int[] result = instance.plusOne(digits);
//        assertArrayEquals(expResult, result);
//    }
    
    @Test
    public void testPlusOneCase5() {
        int[] digits = {0};
        int[] expResult = {1};
        int[] result = instance.plusOne(digits);
        assertArrayEquals(expResult, result);
    }

}
