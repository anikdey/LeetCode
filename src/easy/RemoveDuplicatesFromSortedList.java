package easy;

import java.util.List;

public class RemoveDuplicatesFromSortedList {

    public static void main(String[] args) {
        RemoveDuplicatesFromSortedList obj = new RemoveDuplicatesFromSortedList();

        obj.addNode(1);
        obj.addNode(1);
        obj.addNode(2);
//        obj.addNode(3);
//        obj.addNode(3);

        obj.printList();
        obj.deleteDuplicates(obj.head);

        obj.printList();
    }



    public ListNode deleteDuplicates(ListNode head) {
        if(head == null)
            return head;
        ListNode temp = head.next;
        ListNode prevNode = head;

        while (temp != null) {
            if (prevNode.val == temp.val) {
                prevNode.next = temp.next;
            }else {
                prevNode = temp;
            }
            temp = temp.next;
        }

        return head;
    }

    private ListNode head;
    private ListNode tail;

    private void addNode(int data) {
        ListNode node = new ListNode(data);
        if(head == null) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
    }

    private void printList() {
        if(head != null) {
            ListNode temp = head;
            while (temp != null){
                System.out.print(temp.val+", ");
                temp = temp.next;
            }
            System.out.println();
        }
    }


    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

}
