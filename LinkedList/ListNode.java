package LinkedList;

public class ListNode {
    // 1. Mark fields as public so sub-packages can read/write to them
    public int val;
    public ListNode next;

    // 2. Mark constructors as public so sub-packages can instantiate them
    public ListNode() {}

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}