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
    int diameter = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        longestPath(root);
        return diameter;
    }

    public int longestPath(TreeNode root){
        if(root == null) return 0;
        int leftLongest = longestPath(root.left);
        int rightLongest = longestPath(root.right);
        diameter = Math.max(leftLongest + rightLongest , diameter);
        return Math.max(leftLongest , rightLongest) + 1;
    }
}
