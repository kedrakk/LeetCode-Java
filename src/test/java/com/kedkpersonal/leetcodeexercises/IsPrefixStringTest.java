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
public class IsPrefixStringTest {

    IsPrefixString instance = new IsPrefixString();

    @Test
    public void testIsPrefixStringCase1() {
        String s = "iloveleetcode";
        String[] words = {"i", "love", "leetcode", "apples"};
        boolean expResult = true;
        boolean result = instance.isPrefixString(s, words);
        assertEquals(expResult, result);
    }

    @Test
    public void testIsPrefixStringCase2() {
        String s = "iloveleetcode";
        String[] words = {"apples", "i", "love", "leetcode"};
        boolean expResult = false;
        boolean result = instance.isPrefixString(s, words);
        assertEquals(expResult, result);
    }

}
