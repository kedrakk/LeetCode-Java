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
public class AreOccurrencesEqualTest {
    
    AreOccurrencesEqual instance = new AreOccurrencesEqual();
    
    @Test
    public void testAreOccurrencesEqualCase1() {
        String s = "abacbc";
        boolean expResult = true;
        boolean result = instance.areOccurrencesEqual(s);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testAreOccurrencesEqualCase2() {
        String s = "aaabb";
        boolean expResult = false;
        boolean result = instance.areOccurrencesEqual(s);
        assertEquals(expResult, result);
    }
    
}
