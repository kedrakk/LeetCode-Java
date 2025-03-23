/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kedkpersonal.leetcodeexercises;

/**
 *
 * @author kedk
 */
public class NumOfStrings {

    public int numOfStrings(String[] patterns, String word) {
        int count = 0;
        for (String pt : patterns) {
            if (word.contains(pt)) {
                count++;
            }
        }
        return count;
    }
}
