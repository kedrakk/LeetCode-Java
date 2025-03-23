/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kedkpersonal.leetcodeexercises;

/**
 *
 * @author kedk
 */
public class IsPrefixString {

    public boolean isPrefixString(String s, String[] words) {
        String arrString = "";
        for (String word : words) {
            arrString += word;
            if (arrString.equals(s)) {
                return true;
            }
        }
        return false;
    }
}
