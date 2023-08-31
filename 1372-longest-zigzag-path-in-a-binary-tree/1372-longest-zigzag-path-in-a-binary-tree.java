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
    int max =0;
    public int longestZigZag(TreeNode root) {
        helper(root, 0, 0); //taking left path
        helper(root, 1, 0);
        return max;
    }

    public void helper(TreeNode root, int path, int pathLength){
        if(root == null){
            return;
        }
        max = Math.max(max, pathLength);
        if(path == 1){ //going left
            helper(root.left, 0, pathLength+1);
            helper(root.right, 1, 1);
        }
        else{
            helper(root.right, 1, pathLength+1);
            helper(root.left, 0, 1);
        }
    }
}