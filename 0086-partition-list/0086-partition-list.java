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
    public ListNode partition(ListNode head, int x) {
        ListNode cur=head;       
        ListNode newHead=new ListNode(0);
        ListNode cur2=newHead;
        while(cur!=null){
            if(cur.val<x){
                cur2.next=new ListNode(cur.val);
                cur2=cur2.next;
            }
            cur=cur.next;
        }
        //make sure to update the current node 
        cur=head;
        while(cur!=null){
            if(cur.val>=x){
                cur2.next=new ListNode(cur.val);
                cur2=cur2.next;
            }
            cur=cur.next;
        }
        return newHead.next;
        
    }
}