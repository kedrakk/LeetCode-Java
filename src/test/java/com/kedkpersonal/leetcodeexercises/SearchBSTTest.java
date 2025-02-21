/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.kedkpersonal.leetcodeexercises;

import com.kedkpersonal.leetcodeexercises.models.TreeNode;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author kedk
 */
public class SearchBSTTest {

    @Test
    public void testSearchBSTCase1() {
        TreeNode root = TreeNode.createTree(new Integer[]{4, 2, 7, 1, 3});
        int val = 2;
        SearchBST instance = new SearchBST();
        TreeNode expResult = TreeNode.createTree(new Integer[]{2, 1, 3});
        TreeNode result = instance.searchBST(root, val);
        List<Integer> expArrayList = TreeNode.treeToArrayList(expResult);
        List<Integer> actualArrayList = TreeNode.treeToArrayList(result);
        System.out.println("Expected:" + expArrayList);
        System.out.println("Actual:" + actualArrayList);
        assertEquals(expArrayList, actualArrayList);
    }

    @Test
    public void testSearchBSTCase2() {
        TreeNode root = TreeNode.createTree(new Integer[]{4, 2, 7, 1, 3});
        int val = 5;
        SearchBST instance = new SearchBST();
        TreeNode expResult = TreeNode.createTree(new Integer[]{});
        TreeNode result = instance.searchBST(root, val);
        List<Integer> expArrayList = TreeNode.treeToArrayList(expResult);
        List<Integer> actualArrayList = TreeNode.treeToArrayList(result);
        System.out.println("Expected:" + expArrayList);
        System.out.println("Actual:" + actualArrayList);
        assertEquals(expArrayList, actualArrayList);
    }

}
