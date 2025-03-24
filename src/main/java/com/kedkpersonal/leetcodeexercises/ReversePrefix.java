/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kedkpersonal.leetcodeexercises;

/**
 *
 * @author kedk
 */
public class ReversePrefix {

    public String reversePrefix(String word, char ch) {
        int index = -1;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == ch) {
                index = i;
                break;
            }
        }
        if (index > -1) {
            String str1 = new StringBuilder(word.substring(0, index + 1)).reverse().toString();
            String str2 = word.substring(index + 1);
            return str1.concat(str2);
        } else {
            return word;
        }
    }
}
