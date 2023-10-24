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
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        
        helper(root, res, 0);
        return res;
    }

    public void helper(TreeNode root, List<Integer> res, int i){
        if(root == null)
            return;
        
        if(i == res.size()){
            res.add(root.val);
        }
        else{
            res.set(i, Math.max(res.get(i), root.val));
        }

        helper(root.left, res, i+1);
        helper(root.right, res, i+1);
    }
}