package java_lang.ds;

public class SinglyLinkedList {
    public Node head;
    public Node tail;

    public SinglyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void insertNode(int nodeData) {
        Node node = new Node(nodeData);

        if (this.head == null) {
            this.head = node;
        } else {
            this.tail.next = node;
        }

        this.tail = node;
    }
    public void print(){
        Node node = this.head;
        while (node != null) {
            System.out.println(String.valueOf(node.val));

            node = node.next;

            System.out.println(" ");
        }
    }
}
