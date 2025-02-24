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
public class MinCostClimbingStairsTest {

    MinCostClimbingStairs instance = new MinCostClimbingStairs();

    @Test
    public void testMinCostClimbingStairsCase1() {
        int[] cost = {10, 15, 20};
        int expResult = 15;
        int result = instance.minCostClimbingStairs(cost);
        assertEquals(expResult, result);
    }

    @Test
    public void testMinCostClimbingStairsCase2() {
        int[] cost = {1, 100, 1, 1, 1, 100, 1, 1, 100, 1};
        int expResult = 6;
        int result = instance.minCostClimbingStairs(cost);
        assertEquals(expResult, result);
    }

}
