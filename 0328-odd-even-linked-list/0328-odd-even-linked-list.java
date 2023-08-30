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
    public ListNode oddEvenList(ListNode head) {
        if(head==null || head.next==null)
            return head;
        
        ListNode temp=head;
        ListNode dummy1 = new ListNode(0);
        ListNode odd = dummy1;
        ListNode dummy2 = new ListNode(0);
        ListNode even = dummy2;
        
        int i=1;
        while(temp!=null){
            
            if(i%2==0){
                even.next=temp;
                even=even.next;
            }
            else{
                odd.next=temp;
                odd=odd.next;
            }
            
        temp=temp.next;
            i++;
            
        }
        even.next=null;
        odd.next=dummy2.next;
        
        head=dummy1.next;
        return head;
    }
}