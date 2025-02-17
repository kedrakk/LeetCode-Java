/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.kedkpersonal.leetcodeexercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author kedk
 */
public class KidsWithCandiesTest {

    KidsWithCandies instance = new KidsWithCandies();

    @Test
    public void testCase1() {
        int[] candies = {2, 3, 5, 1, 3};
        int extraCandies = 3;
        List<Boolean> expResult = new ArrayList<>(Arrays.asList(new Boolean[]{true, true, true, false, true}));
        List<Boolean> result = instance.kidsWithCandies(candies, extraCandies);
        assertEquals(expResult, result);
    }

    @Test
    public void testCase2() {
        int[] candies = {4, 2, 1, 1, 2};
        int extraCandies = 1;
        List<Boolean> expResult = new ArrayList<>(Arrays.asList(new Boolean[]{true, false, false, false, false}));
        List<Boolean> result = instance.kidsWithCandies(candies, extraCandies);
        assertEquals(expResult, result);
    }

    @Test
    public void testCase3() {
        int[] candies = {12, 1, 12};
        int extraCandies = 10;
        List<Boolean> expResult = new ArrayList<>(Arrays.asList(new Boolean[]{true, false, true}));
        List<Boolean> result = instance.kidsWithCandies(candies, extraCandies);
        assertEquals(expResult, result);
    }

}
