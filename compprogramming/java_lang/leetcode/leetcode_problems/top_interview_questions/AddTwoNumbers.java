package java_lang.leetcode_problems.top_interview_questions;

import java_lang.linked_list_leetcode.ds.ListNode;
import java_lang.linked_list_leetcode.ds.SinglyLinkedList;

public class AddTwoNumbers {
    public static void main(String[] args) {
        SinglyLinkedList linkedList1 = new SinglyLinkedList();

        linkedList1.insertNode(9);
        linkedList1.insertNode(9);
        linkedList1.insertNode(9);
        linkedList1.insertNode(9);
        linkedList1.insertNode(9);
        linkedList1.insertNode(9);
        linkedList1.insertNode(9);

        SinglyLinkedList linkedList2 = new SinglyLinkedList();
        linkedList2.insertNode(9);
        linkedList2.insertNode(9);
        linkedList2.insertNode(9);
        linkedList2.insertNode(9);

        ListNode result = addTwoNumbers(linkedList1.head, linkedList2.head);
        while (result != null){
            System.out.println(result.val);
            result = result.next;
        }
    }
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode();
        ListNode cur = result;
        int carry = 0;
        while(l1 != null || l2 != null || carry != 0){
            int v1 = 0;
            if(l1 != null){
                v1 = l1.val;
            }
            int v2 = 0;
            if(l2 != null){
                v2 = l2.val;
            }

            //calculate new digit
            int val = v1 + v2 + carry;

            carry = val /10; //carry = 15 -> 5, val = 5 -> 0
            val = val % 10; //val = 15 -> 1 (to put 1 before 7 + 8), val = 5 -> 5
            cur.next = new ListNode(val);
            cur = cur.next;

            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }

        }
        return result.next;
    }
}
