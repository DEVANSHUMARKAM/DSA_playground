package LinkedList.Easy;
import LinkedList.ListNode;

public class AddTwoList {
    public static ListNode addnumbers(ListNode l1, ListNode l2){
        ListNode dummy = new ListNode(-1);
        ListNode tail = dummy;
        int carry = 0;

        while(l1 != null || l2 != null || carry != 0){
            int sum = carry;

            if(l1 != null){
                sum += l1.val;
                l1 = l1.next;
            }

            if(l2 != null){
                sum += l2.val;
                l2 = l2.next;
            }

            carry = sum / 10;
            tail.next = new ListNode(sum % 10);

            tail = tail.next;
        }
        return dummy.next;
    }

    public static void printList(ListNode head){
        ListNode current = head;
        while(current != null){
            System.out.println(current.val);
            if(current.next != null){
                System.out.print(" -> ");
            }
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args){
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        System.out.print("List 1 : ");
        printList(l1);
        System.out.print("List 2 : ");
        printList(l2);

        ListNode added = addnumbers(l1, l2);

        System.out.println("After adding these two lists : ");
        printList(added);
    }
}