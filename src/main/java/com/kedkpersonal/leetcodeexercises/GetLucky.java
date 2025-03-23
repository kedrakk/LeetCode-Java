/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kedkpersonal.leetcodeexercises;

/**
 *
 * @author kedk
 */
public class GetLucky {

    public int getLucky(String s, int k) {
        String sum = "";
        for (int i = 0; i < s.length(); i++) {
            sum += ((int) s.charAt(i) - 'a') + 1;
        }
        int totalSum = 0;
        for (int i = 0; i < k; i++) {
            totalSum = 0;
            for (int j = 0; j < sum.length(); j++) {
                totalSum += Character.getNumericValue(sum.charAt(j));
            }
            sum = Integer.toString(totalSum);
        }
        return totalSum;
    }
}
