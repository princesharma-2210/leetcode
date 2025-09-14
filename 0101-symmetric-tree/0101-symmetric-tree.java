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
    public boolean isSymmetric(TreeNode root) {
        return isMirror(root.left,root.right);
    }
    public boolean isMirror(TreeNode Left, TreeNode Right){
        if(Left==null && Right==null){
            return true;
        }
        if(Left==null || Right==null){
            return false;
        }
        return Left.val==Right.val && isMirror(Left.left,Right.right) && isMirror(Left.right,Right.left);
    }
}