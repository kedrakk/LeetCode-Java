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
public class LeafSimilarTest {

    @Test
    public void testLeafSimilarCase1() {
        TreeNode root1 = TreeNode.createTree(new Integer[]{3, 5, 1, 6, 2, 9, 8, null, null, 7, 4});
        TreeNode root2 = TreeNode.createTree(new Integer[]{3, 5, 1, 6, 7, 4, 2, null, null, null, null, null, null, 9, 8});
        LeafSimilar instance = new LeafSimilar();
        boolean expResult = true;
        boolean result = instance.leafSimilar(root1, root2);
        assertEquals(expResult, result);
    }

    @Test
    public void testLeafSimilarCase2() {
        TreeNode root1 = TreeNode.createTree(new Integer[]{1, 2, 3});
        TreeNode root2 = TreeNode.createTree(new Integer[]{1, 3, 2});
        LeafSimilar instance = new LeafSimilar();
        boolean expResult = false;
        boolean result = instance.leafSimilar(root1, root2);
        assertEquals(expResult, result);
    }

}
