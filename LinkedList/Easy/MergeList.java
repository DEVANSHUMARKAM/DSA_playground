package LinkedList.Easy;
import LinkedList.ListNode;

public class MergeList {
    public static ListNode mergetwolist(ListNode list1, ListNode list2){
        ListNode dummy  = new ListNode(-1);
        ListNode tail = dummy;

        while(list1 != null && list2 != null){
            if(list1.val <= list2.val){
                tail.next = list1;
                list1 = list1.next;
            }else{
                tail.next = list2;
                list2 = list2.next;
            }
            tail = tail.next;
        }
        if(list1 != null){
            tail.next = list1;
        }else{
            tail.next = list2;
        }
        return dummy.next;
    }

    public static void printList(ListNode head){
        ListNode current = head;
        while(current != null){
            System.out.print(current.val);
            if(current.next != null){
                System.out.print(" -> ");
            }
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args){
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(2);
        list1.next.next = new ListNode(4);

        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(3);
        list2.next.next = new ListNode(4);

        System.out.print("List 1 : ");
        printList(list1);

        System.out.print("List 2 : ");
        printList(list2);

        ListNode mergehead = mergetwolist(list1, list2);

        System.out.println("Merged two linked list is: ");
        printList(mergehead);
    }
}