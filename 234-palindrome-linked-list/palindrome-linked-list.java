class Solution {
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true;
        }

        ListNode slow = head;
        ListNode fast = head;
        
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode secondHalfHead = reverseList(slow);

        ListNode ptr1 = head;
        ListNode ptr2 = secondHalfHead;
        
        while (ptr2 != null) {
            if (ptr1.val != ptr2.val) {
                return false;
            }
            ptr1 = ptr1.next;
            ptr2 = ptr2.next;
        }

        return true;
    }

    private ListNode reverseList(ListNode head) {
        ListNode ptr_cache = null;
        ListNode ptr = head;
        
        while (ptr != null) {
            ListNode nextNode = ptr.next;
            ptr.next = ptr_cache;
            ptr_cache = ptr;
            ptr = nextNode;
        }

        return ptr_cache;
    }
}