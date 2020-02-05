package easy;


public class MergeTwoSortedLists {

    public static void main(String[] args) {

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

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}
