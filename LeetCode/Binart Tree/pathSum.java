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
    int target;
    public boolean hasPathSum(TreeNode root, int targetSum) {
        target = targetSum;
        return sumOfValues(root , 0);
    }

    public boolean sumOfValues(TreeNode root , int sum){
        if(root == null) return false;
        sum += root.val;
        if(root.left == null && root.right == null){
            return sum == target;
        }

        boolean left = sumOfValues(root.left , sum);
        boolean right = sumOfValues(root.right , sum);
        return left || right;
        
    }
}
