/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kedkpersonal.leetcodeexercises;

/**
 *
 * @author kedk
 */
public class FindMaxAverage {

    public double findMaxAverage(int[] nums, int k) {
        if (nums.length < k) {
            return 0.0;
        } else if (nums.length == 1) {
            return nums[0];
        } else {
            double windowAvg = 0;
            int windowSum = 0;
            for (int i = 0; i < k; i++) {
                windowSum += nums[i];
            }
            windowAvg = windowSum / (double) k;
            
            if (nums.length > k) {
                double maxAvg = windowAvg;
                for (int i = k; i < nums.length; i++) {
                    windowSum += nums[i] - nums[i - k];
                    windowAvg = windowSum / (double) k;
                    maxAvg = Math.max(maxAvg, windowAvg);

                }
                return maxAvg;
            }
            else{
                return windowAvg;
            }
            
        }
    }
}
