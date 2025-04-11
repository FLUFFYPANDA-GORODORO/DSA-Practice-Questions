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
    TreeNode prev;
    int result;
    public int minDiffInBST(TreeNode root) {
        prev = null;
        result = Integer.MAX_VALUE;
        inorder(root);
        return result;
    }

    public void inorder(TreeNode node){
        if(node == null) return;
        inorder(node.left);
        if(prev != null){
            result = Math.min(result , node.val - prev.val);
        }
        prev = node;
        inorder(node.right);
    }
    

}
