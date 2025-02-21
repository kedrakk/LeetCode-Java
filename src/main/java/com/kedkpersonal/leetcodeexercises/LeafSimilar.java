/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kedkpersonal.leetcodeexercises;

import com.kedkpersonal.leetcodeexercises.models.TreeNode;
import java.util.ArrayList;

/**
 *
 * @author kedk
 */
public class LeafSimilar {

    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        ArrayList<Integer> root1List = new ArrayList<>();
        ArrayList<Integer> root2List = new ArrayList<>();
        this.getLeaf(root1, root1List);
        this.getLeaf(root2, root2List);
        return root1List.equals(root2List);
    }

    private void getLeaf(TreeNode root, ArrayList<Integer> intList) {
        if (root == null) {
            return;
        }
        if (root.left == null && root.right == null) {
            intList.add(root.val);
        }
        getLeaf(root.left, intList);
        getLeaf(root.right, intList);
    }
}
