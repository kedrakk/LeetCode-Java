/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kedkpersonal.leetcodeexercises;

/**
 *
 * @author kedk
 */
public class Tribonacci {

    public int tribonacci(int n) {
        int n0 = 0, n1 = 1, n2 = 1;
        switch (n) {
            case 0 -> {
                return n0;
            }
            case 1 -> {
                return n1;
            }
            case 2 -> {
                return n2;
            }
            case 3 -> {
                return n0 + n1 + n2;
            }
            default -> {
                if (n > 3) {
                    Integer[] intArray = new Integer[n + 1];
                    intArray[0] = n0;
                    intArray[1] = n1;
                    intArray[2] = n2;
                    for (int i = 3; i < n + 1; i++) {
                        intArray[i] = intArray[i - 1] + intArray[i - 2] + intArray[i - 3];
                    }
                    return intArray[n];
                } else {
                    return -1;
                }
            }
        }
    }
}
