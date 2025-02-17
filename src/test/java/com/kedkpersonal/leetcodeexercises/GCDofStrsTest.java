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
public class GCDofStrsTest {
    
    GCDofStrs instance = new GCDofStrs();
    
    @Test
    public void testGCD() {
        int num1 = 6;
        int num2 = 3;
        int expResult = 3;
        int result = instance.gcd(num1, num2);
        assertEquals(expResult, result);
    }
    
    //@Test
    public void testCaseOne() {
        String str1 = "ABC";
        String str2 = "DEF";
        String expResult = "";
        String result = instance.gcdOfStrings(str1, str2);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testCaseTwo() {
        String str1 = "ABCABC";
        String str2 = "ABC";
        String expResult = "ABC";
        String result = instance.gcdOfStrings(str1, str2);
        assertEquals(expResult, result);
    }
    
}
