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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        int len = 0;
        ListNode temp = head;
        
        while(temp != null){
            len++;
            temp = temp.next;
        }
        
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        
        ListNode leftPrev = dummy;
        temp = head;
        for(int i = 0; i < left-1; i++){
            leftPrev = temp;
            temp = temp.next;
        }
        
        ListNode prev = new ListNode();
        for(int i = 0; i < right-left+1; i++){
            ListNode curr = temp.next;
            temp.next = prev;
            prev = temp;
            temp = curr;
        }
        
        leftPrev.next.next = temp;
        leftPrev.next = prev;
        return dummy.next;
        
    }
}