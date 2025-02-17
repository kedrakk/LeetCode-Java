/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kedkpersonal.leetcodeexercises;

/**
 *
 * @author kedk
 */
public class CanPlaceFlowers {

    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if(n==0)
        {
            return true;
        }
        
        int totalCount = 0;
        for (int i = 0; i < flowerbed.length; i++) {
            boolean isLeftEmpty = i == 0 || flowerbed[i - 1] == 0;
            boolean isRightEmpty = i == flowerbed.length - 1 || flowerbed[i + 1] == 0;
            if (flowerbed[i] == 0 && isLeftEmpty && isRightEmpty) {
                flowerbed[i] = 1;
                totalCount++;
                if (totalCount >= n) {
                    return true;
                }
            }
        }
        return totalCount >= n;
    }
}
