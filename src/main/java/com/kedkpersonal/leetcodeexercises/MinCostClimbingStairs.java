/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kedkpersonal.leetcodeexercises;

/**
 *
 * @author kedk
 */
public class MinCostClimbingStairs {

    public int minCostClimbingStairs(int[] cost) {
        int step1 = 0, step2 = 0;
        for (int i = cost.length - 1; i >= 0; i--) {
            int current_step = cost[i] + Math.min(step1, step2);
            step1 = step2;
            step2 = current_step;
        }
        return Math.min(step1, step2);
    }
}
