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
    public ListNode removeNthFromEnd(ListNode head, int n) {
       if(head == null) {
           return null;
       }
        
        int size = 0;
        ListNode temp = head;
        while(temp != null){
            temp = temp.next;
            size++;
        }
        
        n = size - n;
        if(n == 0){
            temp = head.next;
            head.next = null;
            head = null;
            
            return temp;
        }
        
        ListNode curr = head;
        ListNode prev = null;
        
        while(n > 0){
            prev = curr;
            curr = curr.next;
            n--;
        }
        
        prev.next = curr.next;
        curr.next = null;
        curr = null;
        
        return head;
    }
}