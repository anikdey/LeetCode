package easy;

public class RemoveDuplicatesFromSortedList {

    private ListNode head;
    private ListNode tail;

    public static void main(String[] args) {
        RemoveDuplicatesFromSortedList obj = new RemoveDuplicatesFromSortedList();
        obj.addNode(1);
        obj.addNode(2);
        obj.addNode(3);

        //obj.printList();
        //obj.deleteDuplicates(obj.head);
        //obj.printList();

        RemoveDuplicatesFromSortedList obj2 = new RemoveDuplicatesFromSortedList();
        obj2.addNode(2);
        obj2.addNode(3);
        obj2.addNode(4);
        obj2.addNode(5);
        obj2.addNode(8);

        //obj2.printList(obj2.mergeTwoLists(obj.head, obj2.head));

        obj.printList(obj.reverseList(obj.head));

    }

    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode temp = head;
        while (temp != null) {
            ListNode nextNode = temp.next;
            temp.next = prev;
            prev = temp;
            temp = nextNode;
        }
        head = prev;
        return head;
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null)
            return l2;

        if(l2 == null)
            return l1;

        ListNode newHead = null;
        ListNode current;

        if(l1.val > l2.val) {
            newHead = current = l2;
            l2 = l2.next;
            if(l2 == null){
                newHead.next = l1;
            }
        }else {
            newHead = current = l1;
            l1 = l1.next;
            if(l1 == null) {
                newHead.next = l2;
            }
        }


        while (l1 != null && l2 != null) {
            if(l1.val > l2.val) {
                current.next = l2;
                current = l2;
                l2 = l2.next;
                if(l2 == null){
                    current.next = l1;
                }
            } else {
                current.next = l1;
                current = l1;
                l1 = l1.next;
                if(l1 == null) {
                    current.next = l2;
                }
            }
        }
        return newHead;
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

    private void printList(ListNode temp) {
        while (temp != null){
            System.out.print(temp.val+", ");
            temp = temp.next;
        }
        System.out.println();
    }

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

}
