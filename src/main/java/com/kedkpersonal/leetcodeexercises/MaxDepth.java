/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kedkpersonal.leetcodeexercises;

import com.kedkpersonal.leetcodeexercises.models.TreeNode;

/**
 *
 * @author kedk
 */
public class MaxDepth {

    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftCount = maxDepth(root.left);
        int rightCount = maxDepth(root.right);
        return Math.max(leftCount, rightCount) + 1;
    }

}
