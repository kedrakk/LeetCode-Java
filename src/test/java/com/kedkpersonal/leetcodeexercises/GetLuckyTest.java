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
public class GetLuckyTest {
    GetLucky instance = new GetLucky();
    
   @Test
    public void testGetLuckyCase1() {
        String s = "iiii";
        int k = 1;
        int expResult = 36;
        int result = instance.getLucky(s, k);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testGetLuckyCase2() {
        String s = "leetcode";
        int k = 2;
        int expResult = 6;
        int result = instance.getLucky(s, k);
        assertEquals(expResult, result);
    }
    
}
