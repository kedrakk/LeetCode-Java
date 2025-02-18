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
public class RecentCounterTest {
    
    @Test
    public void testPing() {
        RecentCounter instance = new RecentCounter();
        int expResult = 3;
        instance.ping(1);
        instance.ping(100);
        instance.ping(3001);
        int result = instance.ping(3002);
        assertEquals(expResult, result);
    }
    
}
