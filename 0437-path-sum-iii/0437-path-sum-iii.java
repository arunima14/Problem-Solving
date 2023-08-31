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
     public int pathSumIncludeRoot(TreeNode root, long targetSum) {
        if (root == null) return 0;

        int result = 0;

        if ((long)root.val == targetSum) result++;
        
        if (root.left != null) result += pathSumIncludeRoot(root.left, targetSum - (long)root.val);
        if (root.right != null) result += pathSumIncludeRoot(root.right, targetSum - (long)root.val);
        return result;
    }

    public int pathSum(TreeNode root, int targetSum) {
        if (root == null) return 0;

        int result = 0;

        if (root.left != null) result += pathSum(root.left, targetSum);
        if (root.right != null) result += pathSum(root.right, targetSum);
                
        return pathSumIncludeRoot(root, (long)targetSum) + result;
    }
    
}