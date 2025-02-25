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
public class RomanToIntTest {
    RomanToInt instance = new RomanToInt();
    
    @Test
    public void testRomanToIntCase1() {
        String s = "III";
        int expResult = 3;
        int result = instance.romanToInt(s);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testRomanToIntCase2() {
        String s = "LVIII";
        int expResult = 58;
        int result = instance.romanToInt(s);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testRomanToIntCase3() {
        String s = "MCMXCIV";
        int expResult = 1994;
        int result = instance.romanToInt(s);
        assertEquals(expResult, result);
    }
    
}
