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
public class GuessNumberTest {

    @Test
    public void testGuessNumberCase1() {
        int n = 10;
        GuessNumber instance = new GuessNumber(6);
        int expResult = 6;
        int result = instance.guessNumber(n);
        assertEquals(expResult, result);
    }

    @Test
    public void testGuessNumberCase2() {
        int n = 1;
        GuessNumber instance = new GuessNumber(1);
        int expResult = 1;
        int result = instance.guessNumber(n);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testGuessNumberCase3() {
        int n = 2;
        GuessNumber instance = new GuessNumber(1);
        int expResult = 1;
        int result = instance.guessNumber(n);
        assertEquals(expResult, result);
    }

}
