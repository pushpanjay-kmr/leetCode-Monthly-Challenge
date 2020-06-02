package com.hashinclude.june.twenty.two;

/**
 * @author pushpanjay.kumar created on 2/6/20
 */

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

public class Solution {

    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }

}
