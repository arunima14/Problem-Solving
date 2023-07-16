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
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length == 0)
            return null;
        
        ListNode curr = lists[0];
        ListNode prev = new ListNode(0);
        
        for(int i = 1; i < lists.length; i++){
            prev = curr;
            curr = lists[i];
            
            curr = mergeTwoLists(curr, prev);
        }
        
        return curr;
    }
    
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null) return list2;
        if(list2 == null) return list1;
        
        ListNode temp = new ListNode(0);
        ListNode curr = temp;
        
        while(list1 != null && list2 != null){
            if(list1.val > list2.val){
                curr.next = list2;
                list2 = list2.next;
            }else{
                curr.next = list1;
                list1 = list1.next;
            }
            
            curr = curr.next;
        }
        
        if(list1 != null){
            curr.next = list1;
            list1 = list1.next;
        }
        
        if(list2 != null){
            curr.next = list2;
            list2 = list2.next;
        }
        
        return temp.next;
    }
}