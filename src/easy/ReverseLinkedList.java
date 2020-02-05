package easy;

public class ReverseLinkedList {

    public static void main(String[] args) {

    }
    
    public RemoveDuplicatesFromSortedList.ListNode reverseList(RemoveDuplicatesFromSortedList.ListNode head) {
        RemoveDuplicatesFromSortedList.ListNode prev = null;
        RemoveDuplicatesFromSortedList.ListNode temp = head;
        while (temp != null) {
            RemoveDuplicatesFromSortedList.ListNode nextNode = temp.next;
            temp.next = prev;
            prev = temp;
            temp = nextNode;
        }
        head = prev;
        return head;
    }

}
