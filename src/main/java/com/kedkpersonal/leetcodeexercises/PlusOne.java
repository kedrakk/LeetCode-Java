/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kedkpersonal.leetcodeexercises;

/**
 *
 * @author kedk
 */
public class PlusOne {

    public int[] plusOne(int[] digits) {
        //* java.lang.NumberFormatException.forInputString
//        StringBuilder res = new StringBuilder();
//        for (int i = 0; i < digits.length; i++) {
//            res.append(Integer.toString(digits[i]));
//        }
//        Integer newVal = Integer.parseInt(res.toString()) + 1;
//        String newValString = newVal.toString();
//        int[] result = new int[newValString.length()];
//        for (int i = 0; i < newValString.length(); i++) {
//            result[i] = newValString.charAt(i) - '0';
//        }
//        return result;
        int length = digits.length;
        for (int i = length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        int[] result = new int[length + 1];
        result[0] = 1;
        return result;
    }
}
