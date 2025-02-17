/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.kedkpersonal.leetcodeexercises;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author kedk
 */
public class IsSubsequenceTest {
    IsSubsequence instance = new IsSubsequence();
    
    @Test
    public void testIsSubsequenceCase1() {
        String s = "abc";
        String t = "ahbgdc";
        boolean expResult = true;
        boolean result = instance.isSubsequence(s, t);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testIsSubsequenceCase2() {
        String s = "axc";
        String t = "ahbgdc";
        boolean expResult = false;
        boolean result = instance.isSubsequence(s, t);
        assertEquals(expResult, result);
    }
    
}
