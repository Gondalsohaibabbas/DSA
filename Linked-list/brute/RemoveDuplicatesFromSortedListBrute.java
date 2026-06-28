import java.util.ArrayList;

public class RemoveDuplicatesFromSortedListBrute {

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }

    public static ListNode deleteDuplicates(ListNode head) {

        if (head == null)
            return null;

        ArrayList<Integer> list = new ArrayList<>();

        while (head != null) {
            if (!list.contains(head.val))
                list.add(head.val);

            head = head.next;
        }

        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        for (int value : list) {
            current.next = new ListNode(value);
            current = current.next;
        }

        return dummy.next;
    }

    public static void main(String[] args) {

        ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);

        ListNode result = deleteDuplicates(head);

        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}

/*
Time Complexity: O(n²)
Space Complexity: O(n)
*/
