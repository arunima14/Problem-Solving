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
    public ListNode swapNodes(ListNode head, int k) {
         ListNode first = head;
         ListNode second = head;
        
        // Move the first pointer to the kth node from the beginning
        for (int i = 0; i < k - 1; i++) {
            first = first.next;
        }
        
        // Move both pointers simultaneously until first reaches the end of the list
        ListNode temp = first;
        while (temp.next != null) {
            temp = temp.next;
            second = second.next;
        }
        
        // Swap the values of the nodes
        int tempVal = first.val;
        first.val = second.val;
        second.val = tempVal;
        
        return head;
    }
}

//1. start the taversal and store the k-th value in temp variable
//2. traverse till k-th node from the last