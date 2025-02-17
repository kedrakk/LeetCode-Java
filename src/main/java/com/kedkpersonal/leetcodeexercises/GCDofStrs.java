/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kedkpersonal.leetcodeexercises;

/**
 *
 * @author kedk
 */
public class GCDofStrs {
    
    public String gcdOfStrings(String str1, String str2) {
        if (!((str1 + str2).equals(str2 + str1))) {
            return "";
        }
        int length = this.gcd(str1.length(), str2.length());
        return str1.substring(0, length);
    }
    
    protected int gcd(int num1, int num2) {
        return num2 == 0 ? num1 : gcd(num2, num1 % num2);
    }
}
