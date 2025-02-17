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
public class LargestAltitudeTest {

    LargestAltitude instance = new LargestAltitude();

    @Test
    public void testLargestAltitudeCase1() {
        int[] gain = {-5, 1, 5, 0, -7};
        int expResult = 1;
        int result = instance.largestAltitude(gain);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testLargestAltitudeCase2() {
        int[] gain = {-4,-3,-2,-1,4,3,2};
        int expResult = 0;
        int result = instance.largestAltitude(gain);
        assertEquals(expResult, result);
    }

}
