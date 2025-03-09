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
public class SearchInsertTest {

    SearchInsert instance = new SearchInsert();

    @Test
    public void testSearchInsertCase1() {
        int[] nums = {1, 3, 5, 6};
        int target = 5;
        int expResult = 2;
        int result = instance.searchInsert(nums, target);
        assertEquals(expResult, result);
    }

    @Test
    public void testSearchInsertCase2() {
        int[] nums = {1, 3, 5, 6};
        int target = 2;
        int expResult = 1;
        int result = instance.searchInsert(nums, target);
        assertEquals(expResult, result);
    }

    @Test
    public void testSearchInsertCase3() {
        int[] nums = {1, 3, 5, 6};
        int target = 7;
        int expResult = 4;
        int result = instance.searchInsert(nums, target);
        assertEquals(expResult, result);
    }

    @Test
    public void testSearchInsertCase4() {
        int[] nums = {1, 3, 5, 6};
        int target = 0;
        int expResult = 0;
        int result = instance.searchInsert(nums, target);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testSearchInsertCase5() {
        int[] nums = {1001};
        int target = 5;
        int expResult = 0;
        int result = instance.searchInsert(nums, target);
        assertEquals(expResult, result);
    }

}
