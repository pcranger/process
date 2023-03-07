package java_lang.ds;

public class Node {
    //private requires getters and setters
    public int val;
    public Node next;

    Node() {
    }

    Node(int val) {
        this.val = val;
    }

    Node(int val, Node next) {
        this.val = val;
        this.next = next;
    }
}
