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
public class MinTimeToTypeTest {

    MinTimeToType instance = new MinTimeToType();

    //@Test
    public void testTwoLoopsCase1() {
        assertEquals(1, instance.getMinStep('b', 'a'));
        assertEquals(2, instance.getMinStep('b', 'z'));
    }

    @Test
    public void testMinTimeToTypeBaseCase() {
        String word = "abc";
        int expResult = 5;
        int result = instance.minTimeToType(word);
        assertEquals(expResult, result);
    }

    @Test
    public void testMinTimeToTypeComplexCaseBase() {
        String word = "bza";
        int expResult = 7;
        int result = instance.minTimeToType(word);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testMinTimeToTypeComplexCaseBase1() {
        String word = "zjpc";
        int expResult = 34;
        int result = instance.minTimeToType(word);
        assertEquals(expResult, result);
    }

}
