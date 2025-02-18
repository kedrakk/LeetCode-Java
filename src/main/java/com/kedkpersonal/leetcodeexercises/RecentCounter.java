/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kedkpersonal.leetcodeexercises;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author kedk
 */
public class RecentCounter {

    Queue<Integer> counter;

    public RecentCounter() {
        counter = new LinkedList<>();
    }

    public int ping(int t) {
        counter.add(t);
        while (!counter.isEmpty() && counter.peek() < t - 3000) {
            counter.poll();
        }
        return counter.size();
    }
}
