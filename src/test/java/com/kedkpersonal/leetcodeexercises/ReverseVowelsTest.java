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
public class ReverseVowelsTest {

    ReverseVowels instance = new ReverseVowels();

    @Test
    public void testCase1() {
        String s = "IceCreAm";
        String expResult = "AceCreIm";
        String result = instance.reverseVowels(s);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testCase2() {
        String s = "leetcode";
        String expResult = "leotcede";
        String result = instance.reverseVowels(s);
        assertEquals(expResult, result);
    }

}
