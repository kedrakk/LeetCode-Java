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
public class TribonacciTest {

    Tribonacci instance = new Tribonacci();

    @Test
    public void testTribonacciCase1() {
        int n = 4;
        int expResult = 4;
        int result = instance.tribonacci(n);
        assertEquals(expResult, result);
    }

    @Test
    public void testTribonacciCase2() {
        int n = 25;
        int expResult = 1389537;
        int result = instance.tribonacci(n);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testTribonacciCase3() {
        int n = 0;
        int expResult = 0;
        int result = instance.tribonacci(n);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testTribonacciCase4() {
        int n = 1;
        int expResult = 1;
        int result = instance.tribonacci(n);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testTribonacciCase5() {
        int n = 2;
        int expResult = 1;
        int result = instance.tribonacci(n);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testTribonacciCase6() {
        int n = 3;
        int expResult = 2;
        int result = instance.tribonacci(n);
        assertEquals(expResult, result);
    }

}
