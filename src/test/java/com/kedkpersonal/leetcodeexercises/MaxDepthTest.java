/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.kedkpersonal.leetcodeexercises;

import com.kedkpersonal.leetcodeexercises.models.TreeNode;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author kedk
 */
public class MaxDepthTest {

    @Test
    public void testMaxDepthCase1() {
        TreeNode root = TreeNode.createTree(new Integer[]{3, 9, 20, null, null, 15, 7});
        MaxDepth instance = new MaxDepth();
        int expResult = 3;
        int result = instance.maxDepth(root);
        assertEquals(expResult, result);
    }

    @Test
    public void testMaxDepthCase2() {
        TreeNode root = TreeNode.createTree(new Integer[]{1, null, 2});
        MaxDepth instance = new MaxDepth();
        int expResult = 2;
        int result = instance.maxDepth(root);
        assertEquals(expResult, result);
    }

    @Test
    public void testMaxDepthCase3() {
        TreeNode root = TreeNode.createTree(new Integer[]{-8, -6, 7, 6, null, null, null, null, 5});
        MaxDepth instance = new MaxDepth();
        int expResult = 4;
        int result = instance.maxDepth(root);
        assertEquals(expResult, result);
    }

}
