/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode ptr = head;
        int count = 0;
        while(ptr != null){
            ptr = ptr.next;
            count++;
        }
        ptr = head;
        int mid = (count/2);
        while(mid != 0){
            ptr = ptr.next;
            mid--;
        }
        return ptr;
    }
}