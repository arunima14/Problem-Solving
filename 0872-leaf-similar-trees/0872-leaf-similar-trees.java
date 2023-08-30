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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        
        addLeaves(root1, list1);
        addLeaves(root2, list2);
        
        return list1.equals(list2);            
    }
    
    public void addLeaves(TreeNode root, List<Integer> arr1){
        if(root == null){
            return;
        }

        if(root.left == null && root.right == null){
            arr1.add(root.val);
        }
        addLeaves(root.left, arr1);
        addLeaves(root.right,arr1);
    }
}