/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int goodNodes(TreeNode root) {
        // if(root.size() == 1)
        //     return 1;
        
        return isNodeGood(root, Integer.MIN_VALUE);
    }
    
    int c = 0;
    public int isNodeGood(TreeNode root, int maxNodeVal){
        if(root==null){
            return c;
        }
        if(root.val>=maxNodeVal){
            c++;
            maxNodeVal=root.val;
        }
        isNodeGood(root.left,maxNodeVal);
        isNodeGood(root.right,maxNodeVal);
        
        return c;
    }
}