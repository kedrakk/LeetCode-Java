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
public class PivotIndexTest {

    PivotIndex instance = new PivotIndex();

    @Test
    public void testPivotIndexCase1() {
        int[] nums = {1, 7, 3, 6, 5, 6};
        int expResult = 3;
        int result = instance.pivotIndex(nums);
        assertEquals(expResult, result);
    }

    @Test
    public void testPivotIndexCase2() {
        int[] nums = {1, 2, 3};
        int expResult = -1;
        int result = instance.pivotIndex(nums);
        assertEquals(expResult, result);
    }

    @Test
    public void testPivotIndexCase3() {
        int[] nums = {2, 1, -1};
        int expResult = 0;
        int result = instance.pivotIndex(nums);
        assertEquals(expResult, result);
    }

}
