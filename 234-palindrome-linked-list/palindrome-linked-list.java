class Solution {
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) return true;

        // slow lands at the END of the first half (for both odd & even lengths)
        ListNode slow = head, fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Reverse the second half in place
        ListNode secondHalf = reverse(slow.next);

        // Compare first half vs reversed second half
        ListNode p1 = head, p2 = secondHalf;
        boolean isPalin = true;
        while (p2 != null) {
            if (p1.val != p2.val) { isPalin = false; break; }
            p1 = p1.next;
            p2 = p2.next;
        }

        // Restore original list (so input is not mutated)
        slow.next = reverse(secondHalf);

        return isPalin;
    }

    private ListNode reverse(ListNode head) {
        ListNode prev = null;
        while (head != null) {
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }
}