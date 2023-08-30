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
    public int pairSum(ListNode head) {
        if(head.next.next == null)
            return head.val+head.next.val;
        
        
        int count = 0;
        ListNode cur = head;
        while (cur != null) {
            count++;
            cur = cur.next;
        }

        int[] sum = new int[count / 2];
        
        cur = head;
        for (int i = 0; i < sum.length; ++i) {
            sum[i] = cur.val;
            cur = cur.next;
        }

        int maxSum = Integer.MIN_VALUE;

        for (int i = sum.length - 1; i >= 0; --i) {
            maxSum = (int)Math.max(maxSum, sum[i] + cur.val);
            cur = cur.next;
        }

        return maxSum;
    }
}