import java.util.HashSet;

public class LinkedListCycleBrute {

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }

    public static boolean hasCycle(ListNode head) {

        HashSet<ListNode> set = new HashSet<>();

        while (head != null) {

            if (set.contains(head))
                return true;

            set.add(head);
            head = head.next;
        }

        return false;
    }

    public static void main(String[] args) {

        ListNode head = new ListNode(3);
        head.next = new ListNode(2);
        head.next.next = new ListNode(0);
        head.next.next.next = new ListNode(-4);

        head.next.next.next.next = head.next;

        System.out.println(hasCycle(head));
    }
}

/*
Time Complexity: O(n)
Space Complexity: O(n)
*/
