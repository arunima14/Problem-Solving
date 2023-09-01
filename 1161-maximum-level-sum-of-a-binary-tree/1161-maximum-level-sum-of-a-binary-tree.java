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
    public int maxLevelSum(TreeNode root) {
        int maxSum= Integer.MIN_VALUE;
        if(root==null){
            return maxSum;
        }
        Queue<TreeNode> q= new LinkedList<>();
        q.add(root);
        int level =1, maxLevel=1;
        while(!q.isEmpty()){
            TreeNode currNode =null;
            int sum =0;
            int size= q.size();

            while(size > 0){
                currNode = q.remove();
                sum += currNode.val;
                
                if(currNode.left != null) q.add(currNode.left);
                if(currNode.right != null) q.add(currNode.right);
                size--;
                 
            }
            if(maxSum < sum){
                maxSum=sum;
                maxLevel = level;
            } 
            level++;
        }

        return maxLevel;
    }
}