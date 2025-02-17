/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kedkpersonal.leetcodeexercises;

/**
 *
 * @author kedk
 */
public class MoveZeroes {

    public void moveZeroes(int[] nums) {
        if (nums.length > 1) {
            int startIndex = 0;
            int endIndex = nums.length - 1;
            while (startIndex < endIndex) {
                if (nums[startIndex] == 0) {
                    int tmp = nums[startIndex];
                    for (int i = startIndex; i < endIndex; i++) {
                        nums[i] = nums[i + 1];
                    }
                    nums[endIndex] = tmp;
                    endIndex--;
                    if (nums[startIndex] == 0) {
                        startIndex--;
                    }
                }
                startIndex++;
            }
        }
    }
}
