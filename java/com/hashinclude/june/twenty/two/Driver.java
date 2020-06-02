package com.hashinclude.june.twenty.two;

/**
 * @author pushpanjay.kumar created on 2/6/20
 */
public class Driver {

    private static ListNode createLinkedList(){
        ListNode head = new ListNode(4);
        head.next = new ListNode(5);
        head.next.next = new ListNode(1);
        head.next.next.next = new ListNode(9);
        return head;
    }

    private static void traverseList(ListNode head){
        System.out.println();
        while (head!=null){
            System.out.print(head.val + "->");
            head= head.next;
        }
    }

    public static void main(String[] args) {
        ListNode head = createLinkedList();
        traverseList(head);
        Solution s = new Solution();
        s.deleteNode(head.next.next);
        traverseList(head);
    }
}
