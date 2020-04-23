package Week2;

import java.util.ArrayList;
import java.util.List;

public class MiddleOfLinkedList {
    static class ListNode {
        int val;
        ListNode next;

        public ListNode(int x) {
            val = x;
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[] { 1,2,3,4,5,6 };
        // Definition for singly-linked list.

        ListNode nextNode = new ListNode(arr[arr.length - 1]);
        nextNode.next = null;
        ListNode node = null;
        for (int i = arr.length - 1; i >= 0; i--) {
            node = new ListNode(arr[i]);
            node.next = nextNode;
            nextNode = node;
        }
        ListNode head = node;
        head = middleNode(head);
        while(head.next!=null){
            System.out.print(head.val+",");
            head = head.next;
        }
    }

    public static ListNode middleNode(ListNode head) {
        List<ListNode> list = new ArrayList<>();
        while (head != null) {
            list.add(head);
            head = head.next;
        }
        int size = list.size();
        ListNode mid = null;

        mid = list.get((size) / 2);
        return mid;
    }
}