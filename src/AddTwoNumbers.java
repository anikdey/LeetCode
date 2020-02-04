public class AddTwoNumbers {

    public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
    }

    private ListNode head = null;
    private ListNode tail = null;

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int firstNumber = getReversedNumber(l1);
        int secondNumber = getReversedNumber(l2);
        int sum = firstNumber + secondNumber;
        while (sum != 0) {
            addNode(sum%10);
            sum = sum/10;
        }
        return  head;
    }

    public static void main(String[] args) {
        AddTwoNumbers object = new AddTwoNumbers();

        //object.addTwoNumbers()
    }

    public void addNode(int data) {
        ListNode newNode = new ListNode(data);
        if(head == null) {
            head = newNode;
        } else {
            tail.next = newNode;
        }
        tail = newNode;
    }

    private int getReversedNumber(ListNode head) {
        ListNode prevNode = null;
        ListNode temp = head;
        while (temp != null) {
            ListNode nextNode = temp.next;
            temp.next = prevNode;
            prevNode = temp;
            temp = nextNode;
        }
        int sum = 0;
        while (prevNode != null) {
            sum = sum*10 + prevNode.val;
            prevNode = prevNode.next;
        }
        return sum;
    }
}
