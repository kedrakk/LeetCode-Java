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
public class FindDifferenceTest {

    FindDifference instance = new FindDifference();

    @Test
    public void testFindDifference1() {
        int[] nums1 = {1, 2, 3};
        int[] nums2 = {2, 4, 6};

        List<Integer> expNums1 = new ArrayList<>(Arrays.asList(1,3));
        List<Integer> expNums2 = new ArrayList<>(Arrays.asList(4,6));

        List<List<Integer>> expResult = List.of(expNums1,expNums2);
        List<List<Integer>> result = instance.findDifference(nums1, nums2);
        assertEquals(expResult, result);
    }

    @Test
    public void testFindDifference2() {
        int[] nums1 = {1, 2, 3, 3};
        int[] nums2 = {1, 1, 2, 2};
        List<List<Integer>> expResult = List.of(new ArrayList<>(Arrays.asList(3)), new ArrayList<>());
        List<List<Integer>> result = instance.findDifference(nums1, nums2);
        assertEquals(expResult, result);
    }

}
