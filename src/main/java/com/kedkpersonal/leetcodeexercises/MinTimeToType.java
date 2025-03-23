/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kedkpersonal.leetcodeexercises;

/**
 *
 * @author kedk
 */
public class MinTimeToType {

    int getMinStep(char currentChar, char startingChar) {
        int clockwise = Math.abs(startingChar - currentChar);
        int counterClockwise = 26 - clockwise;
        return Math.min(clockwise, counterClockwise);
    }

    public int minTimeToType(String word) {
        char prevChar = 'a';
        int sum = 0;

        for (int i = 0; i < word.length(); i++) {
            char currentChar = word.charAt(i);
            int currentStep = getMinStep(currentChar, prevChar);
            sum += currentStep + 1;

            //Set current char
            prevChar = currentChar;
        }
        return sum;
    }

}
