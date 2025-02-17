/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.kedkpersonal.leetcodeexercises;

/**
 *
 * @author kedk
 */
public class MergeStringAltn {

    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        int length = Math.min(word1.length(), word2.length());
        int currentIndex = 0;
        while (currentIndex < length) {
            sb.append(word1.charAt(currentIndex)).append(word2.charAt(currentIndex));
            currentIndex++;
        }
        if (currentIndex < word1.length()) {
            sb.append(word1, currentIndex, word1.length());
        }
        if (currentIndex < word2.length()) {
            sb.append(word2, currentIndex, word2.length());
        }

        return sb.toString();
    }
}
