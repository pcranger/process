package java_lang.linked_list_leetcode.ds;

public class SinglyLinkedList {
    public ListNode head;
    public ListNode tail;

    public SinglyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void insertNode(int nodeData) {
        ListNode listNode = new ListNode(nodeData);

        if (this.head == null) {
            this.head = listNode;
        } else {
            this.tail.next = listNode;
            //For any subsequent insertion, this.tail points to the previously inserted node. this.tail.next is updated before the new node is assigned to this.tail:
            //at first node insert, because head and tail points to same value , this.tail.next is similar to this.head.next
        }

        this.tail = listNode;
    }
    public void print(){
        ListNode listNode = this.head;
        while (listNode != null) {
            System.out.println(String.valueOf(listNode.val));

            listNode = listNode.next;

            System.out.println(" ");
        }
    }
}
