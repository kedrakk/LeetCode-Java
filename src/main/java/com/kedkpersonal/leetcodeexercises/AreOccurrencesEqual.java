/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kedkpersonal.leetcodeexercises;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 *
 * @author kedk
 */
public class AreOccurrencesEqual {

    public boolean areOccurrencesEqual(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            int count = 1;
            if (map.containsKey(s.charAt(i))) {
                count = map.get(s.charAt(i)) + 1;
            }
            map.put(s.charAt(i), count);
        }
        int distinctCount = (new HashSet(map.values())).size();
        return distinctCount <= 1;
    }
}
