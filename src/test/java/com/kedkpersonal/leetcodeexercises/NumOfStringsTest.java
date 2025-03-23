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
public class NumOfStringsTest {

    NumOfStrings instance = new NumOfStrings();

    @Test
    public void testNumOfStringsCase1() {
        String[] patterns = {"a", "abc", "bc", "d"};
        String word = "abc";
        int expResult = 3;
        int result = instance.numOfStrings(patterns, word);
        assertEquals(expResult, result);
    }

    @Test
    public void testNumOfStringsCase2() {
        String[] patterns = {"a", "b", "c"};
        String word = "aaaaabbbbb";
        int expResult = 2;
        int result = instance.numOfStrings(patterns, word);
        assertEquals(expResult, result);
    }

    @Test
    public void testNumOfStringsCase3() {
        String[] patterns = {"a", "a", "a"};
        String word = "ab";
        int expResult = 3;
        int result = instance.numOfStrings(patterns, word);
        assertEquals(expResult, result);
    }

}
