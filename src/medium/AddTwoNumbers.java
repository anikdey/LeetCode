package medium;

public class AddTwoNumbers {

    public static void main(String[] args) {

    }



    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        while (l1 != null || l2 != null || carry != 0) {
            int sum = 0;

            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }

            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }
            sum += carry;

            if (sum >= 10) {
                carry = 1;
                sum -= 10;
            } else {
                carry = 0;
            }

            addNode(sum);
        }
        return head;
    }

    private ListNode head;
    private ListNode tail;

    public void addNode(int data) {
        ListNode node = new ListNode(data);
        if(head == null) {
            head = node;
        } else {
            tail.next = node;
        }
        tail = node;
    }

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}
