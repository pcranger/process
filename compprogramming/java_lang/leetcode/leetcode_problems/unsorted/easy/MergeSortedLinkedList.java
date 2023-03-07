package java_lang.leetcode_problems.unsorted.easy;

import java_lang.ds.Node;
import java_lang.ds.SinglyLinkedList;

public class MergeSortedLinkedList {
    public static void main(String[] args) {
        SinglyLinkedList list1 = new SinglyLinkedList();

        list1.insertNode(1);
        list1.insertNode(3);
        list1.insertNode(1);
        list1.insertNode(2);
        list1.insertNode(3);
        SinglyLinkedList list2 = new SinglyLinkedList();
        list1.insertNode(2);
        list1.insertNode(3);
        list1.insertNode(4);

        Node result = getMergeSortedLinkedList(list1.head, list2.head);
    }
    public static Node getMergeSortedLinkedList(Node head1, Node head2){
        Node dummy = null;

        if(head1 == null) return head2;
        if(head2 == null) return head1;

        //choose the head for dummy, so you can do tail.next(can't do with null)
        if(head1.val < head2.val){
            dummy = head1;
            head1 = head1.next;
        }else{
            dummy = head2;
            head2 = head2.next;
        }

        Node tail = dummy;

        while(head1 != null && head2 != null){
            if(head1.val < head2.val){
                tail.next = head1;
                head1 = head1.next;
            }else{
                tail.next = head2;
                head2 = head2.next;
            }
            tail = tail.next;
        }
        if(head1 == null){
            tail.next = head2;
        }else if(head2 == null){
            tail.next = head1;
        }

        return dummy;
    }
}
