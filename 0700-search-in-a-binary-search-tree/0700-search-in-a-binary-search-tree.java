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
    public TreeNode searchBST(TreeNode root, int val) {
        TreeNode temp = root;
        
        while(temp != null){
            if(temp.val == val)
                return temp;

            else if(temp.val > val){
                return searchBST(temp.left, val);
            }
            else
                return searchBST(temp.right, val);
        }
        
        return null;
    }
}