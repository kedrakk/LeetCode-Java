/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.kedkpersonal.leetcodeexercises;

import com.kedkpersonal.leetcodeexercises.models.ListNode;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author kedk
 */
public class ReverseListTest {

    @Test
    public void testReverseListCase1() {
        int[] inputArray = {1, 2, 3, 4, 5};
        int[] expectedArray = {5, 4, 3, 2, 1};
        ListNode head = ListNode.arrayToLinkedList(inputArray);
        ListNode reversedHead = new ReverseList().reverseList(head);
        assertArrayEquals(expectedArray, ListNode.linkedListToArray(reversedHead));
    }

    @Test
    public void testReverseListCase2() {
        int[] inputArray = {1, 2};
        int[] expectedArray = {2, 1};
        ListNode head = ListNode.arrayToLinkedList(inputArray);
        ListNode reversedHead = new ReverseList().reverseList(head);
        assertArrayEquals(expectedArray, ListNode.linkedListToArray(reversedHead));
    }

    @Test
    public void testReverseListCase3() {
        int[] inputArray = {};
        int[] expectedArray = {};
        ListNode head = ListNode.arrayToLinkedList(inputArray);
        ListNode reversedHead = new ReverseList().reverseList(head);
        assertArrayEquals(expectedArray, ListNode.linkedListToArray(reversedHead));
    }

}
