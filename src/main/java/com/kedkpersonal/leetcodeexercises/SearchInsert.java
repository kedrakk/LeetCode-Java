/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kedkpersonal.leetcodeexercises;

/**
 *
 * @author kedk
 */
public class SearchInsert {

// O(n) solution
//    public int searchInsert(int[] nums, int target) {
//        int lastIndex = 0;
//        for (int i = 0; i < nums.length; i++) {
//            if (i == 0 && target < nums[i]) {
//                return 0;
//            } else if (nums[i] == target) {
//                return i;
//            } else if (nums[lastIndex] < target && target < nums[i]) {
//                return i;
//            }
//            lastIndex = i;
//        }
//        return lastIndex + 1;
//    }
    
    
// O(log n) solution
    public int searchInsert(int[] nums, int target) {
        int leftIndex = 0;
        int rightIndex = nums.length - 1;
        while (leftIndex <= rightIndex) {
            int midIndex = leftIndex + (rightIndex - leftIndex) / 2;
            if (nums[midIndex] == target) {
                return midIndex;
            } else if (nums[midIndex] < target) {
                leftIndex = midIndex + 1;
            } else {
                rightIndex = midIndex - 1;
            }
        }
        return leftIndex;
    }
}
