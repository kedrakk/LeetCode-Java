/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kedkpersonal.leetcodeexercises;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 *
 * @author kedk
 */
public class FindDifference {

    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        
        HashSet<Integer> nums1Set = new HashSet<>();
        for (int i = 0; i < nums1.length; i++) {
            nums1Set.add(nums1[i]);
        }
        
        HashSet<Integer> nums2Set = new HashSet<>();
        for (int i = 0; i < nums2.length; i++) {
            nums2Set.add(nums2[i]);
        }
        
        HashSet<Integer> uniqueNums1Set = new HashSet<>(nums1Set);
        uniqueNums1Set.removeAll(nums2Set);
        
        HashSet<Integer> uniqueNums2Set = new HashSet<>(nums2Set);
        uniqueNums2Set.removeAll(nums1Set);

        return List.of(new ArrayList<>(uniqueNums1Set),new ArrayList<>(uniqueNums2Set));
    }
}
