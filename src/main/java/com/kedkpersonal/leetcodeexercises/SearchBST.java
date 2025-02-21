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
public class SearchBST {

    public TreeNode searchBST(TreeNode root, int val) {
        TreeNode current = root;
        while (current != null) {
            if (current.val == val) {
                return current;
            }
            if (current.val > val) {
                current = current.left;
            } else if (current.val < val) {
                current = current.right;
            }
        }
        return current;
    }
}
