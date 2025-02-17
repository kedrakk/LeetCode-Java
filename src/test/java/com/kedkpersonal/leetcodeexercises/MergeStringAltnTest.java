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
public class MergeStringAltnTest {
    
    @Test
    public void testMergeAlternately() {
        System.out.println("mergeAlternately");
        String word1 = "cf";
        String word2 = "eee";
        MergeStringAltn instance = new MergeStringAltn();
        String expResult = "cefee";
        String result = instance.mergeAlternately(word1, word2);
        assertEquals(expResult, result);
    }
    
}
