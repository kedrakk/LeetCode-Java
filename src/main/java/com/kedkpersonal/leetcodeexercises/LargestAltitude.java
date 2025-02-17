/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kedkpersonal.leetcodeexercises;

/**
 *
 * @author kedk
 */
public class LargestAltitude {

    public int largestAltitude(int[] gain) {
        int altitude = 0;
        int maxAltitude = 0;
        for (int i = 0; i < gain.length; i++) {
            altitude = altitude + gain[i];
            maxAltitude = Math.max(altitude, maxAltitude);
        }
        return maxAltitude;
    }
}
