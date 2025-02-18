/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kedkpersonal.leetcodeexercises;

import java.util.HashMap;
import java.util.HashSet;

/**
 *
 * @author kedk
 */
public class UniqueOccurrences {

    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> arrWithCount = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int itemCount = arrWithCount.getOrDefault(arr[i], 0) + 1;
            arrWithCount.put(arr[i], itemCount);
        }

        HashSet<Integer> hashValuesSet = new HashSet(arrWithCount.values());
        return arrWithCount.size() == hashValuesSet.size();
    }
}
