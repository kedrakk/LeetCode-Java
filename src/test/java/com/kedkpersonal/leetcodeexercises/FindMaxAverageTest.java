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
public class FindMaxAverageTest {
    
    FindMaxAverage instance = new FindMaxAverage();
    
    //@Test
    public void testFindMaxAverageCase1() {
        int[] nums = {1,12,-5,-6,50,3};
        int k = 4;
        double expResult = 12.75000;
        double result = instance.findMaxAverage(nums, k);
        assertEquals(expResult, result, 0);
    }
    
    //@Test
    public void testFindMaxAverageCase2() {
        int[] nums = {5};
        int k = 1;
        double expResult = 5.00000;
        double result = instance.findMaxAverage(nums, k);
        assertEquals(expResult, result, 0);
    }
    
    @Test
    public void testFindMaxAverageCase3() {
        int[] nums = {4,0,4,3,3};
        int k = 5;
        double expResult = 2.80000;
        double result = instance.findMaxAverage(nums, k);
        assertEquals(expResult, result, 0);
    }
    
}
