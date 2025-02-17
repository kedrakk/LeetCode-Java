/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.kedkpersonal.leetcodeexercises;

import java.util.Arrays;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author kedk
 */
public class MoveZeroesTest {

    MoveZeroes instance = new MoveZeroes();

   // @Test
    public void testCase1() {
        int[] nums = {0, 1, 0, 3, 12};
        instance.moveZeroes(nums);
        int[] expected = {1, 3, 12, 0, 0};
        assertTrue(Arrays.equals(expected, nums));
    }

   // @Test
    public void testCase2() {
        int[] nums = {0};
        instance.moveZeroes(nums);
        int[] expected = {0};
        assertTrue(Arrays.equals(expected, nums));
    }

    @Test
    public void testCase3() {
        int[] nums = {0, 0, 1};
        instance.moveZeroes(nums);
        int[] expected = {1, 0, 0};
        assertTrue(Arrays.equals(expected, nums));
    }

}
