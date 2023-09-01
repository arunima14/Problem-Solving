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
    public List<Integer> rightSideView(TreeNode root) {
        ArrayList<Integer> ret = new ArrayList<>();
        rightViewOfBTree(root,ret,0);
        return ret;
    }
    public void rightViewOfBTree(TreeNode root,ArrayList<Integer> ret,int levelCount){
        if(root==null){
            return ;
        }
        if(levelCount==ret.size()){
                ret.add(root.val);
        }
        rightViewOfBTree(root.right,ret,levelCount+1);
        rightViewOfBTree(root.left,ret,levelCount+1);        
    }
}