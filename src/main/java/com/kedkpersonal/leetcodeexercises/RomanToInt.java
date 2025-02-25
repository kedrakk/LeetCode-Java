/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kedkpersonal.leetcodeexercises;

import java.util.HashMap;

/**
 *
 * @author kedk
 */
public class RomanToInt {

    public int romanToInt(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int result = 0;
        int prevInt = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            char currentRoman = s.charAt(i);

            Integer currentIntByRoman = map.get(currentRoman);

            if (currentIntByRoman < prevInt) {
                result -= currentIntByRoman;
            } else {
                result += currentIntByRoman;
            }
            prevInt = currentIntByRoman;
        }
        return result;
    }
}
