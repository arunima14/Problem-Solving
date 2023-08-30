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
    public ListNode deleteMiddle(ListNode head) {
        ListNode cur = head;
        int count = 1;
        while (cur.next != null) {
            count++;
            cur = cur.next;
        }

        if (count == 1) return null;

        ListNode prev = head;
        cur = head.next;
        int idx = 1;
        int middleIdx = count / 2;
        while (idx != middleIdx) {
            prev = prev.next;
            cur = cur.next;
            idx++;
        } 

        prev.next = cur.next;
        return head;
        
        
    }
}