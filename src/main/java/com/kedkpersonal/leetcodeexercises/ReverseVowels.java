/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kedkpersonal.leetcodeexercises;

import java.util.Arrays;

/**
 *
 * @author kedk
 */
public class ReverseVowels {

    public String reverseVowels(String s) {
        String vowels = "aeiou";
        char[] original = s.toCharArray();
        int startIndex = 0;
        int endIndex = original.length - 1;

        while (startIndex < endIndex) {
            if (vowels.indexOf(Character.toLowerCase(original[startIndex])) == -1) {
                startIndex++;
                continue;
            }
            if (vowels.indexOf(Character.toLowerCase(original[endIndex])) == -1) {
                endIndex--;
                continue;
            }

            char tmp = original[startIndex];
            original[startIndex] = original[endIndex];
            original[endIndex] = tmp;
            startIndex++;
            endIndex--;
        }

        return String.valueOf(original);
    }
}
