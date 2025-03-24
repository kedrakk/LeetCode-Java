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
public class ReversePrefixTest {
    ReversePrefix instance = new ReversePrefix();
    
    //@Test
    public void testReversePrefixCase1() {
        String word = "abcd";
        char ch = 'z';
        String expResult = "abcd";
        String result = instance.reversePrefix(word, ch);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testReversePrefixCase2() {
        String word = "abcdefd";
        char ch = 'd';
        String expResult = "dcbaefd";
        String result = instance.reversePrefix(word, ch);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testReversePrefixCase3() {
        String word = "xyxzxe";
        char ch = 'z';
        String expResult = "zxyxxe";
        String result = instance.reversePrefix(word, ch);
        assertEquals(expResult, result);
    }
    
}
