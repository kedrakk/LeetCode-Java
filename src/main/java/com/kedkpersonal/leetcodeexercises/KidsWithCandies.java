/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kedkpersonal.leetcodeexercises;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author kedk
 */
public class KidsWithCandies {

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        Boolean[] result = new Boolean[candies.length];
        int maxVal = 0;
        for (int i = 0; i < candies.length; i++) {
            maxVal = Math.max(candies[i], maxVal);
        }
        for (int i = 0; i < candies.length; i++) {
            result[i] = (candies[i] + extraCandies) >= maxVal;
        }
        return Arrays.asList(result);
    }
}
