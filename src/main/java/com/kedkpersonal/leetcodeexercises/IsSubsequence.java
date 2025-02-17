/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kedkpersonal.leetcodeexercises;

/**
 *
 * @author kedk
 */
public class IsSubsequence {

    public boolean isSubsequence(String s, String t) {
        if (s.length() > t.length()) {
            return false;
        }

        int sPointer = 0;
        int tPointer = 0;

        while (sPointer < s.length() && tPointer < t.length()) {
            
            if (s.charAt(sPointer) == t.charAt(tPointer)) {
                sPointer++;
            }
            tPointer++;
        }
        
        return sPointer == s.length();
    }
}
