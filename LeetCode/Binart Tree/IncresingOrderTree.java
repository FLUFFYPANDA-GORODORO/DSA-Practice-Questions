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
    TreeNode head , tail;
    public TreeNode increasingBST(TreeNode root) {
        head = null;
        tail = null;
        inorder(root);

        return head;
    }

    public void inorder(TreeNode root){
      
        if(root == null) return;

        inorder(root.left);
        TreeNode newNode = new TreeNode(root.val);
        if(head == null){
            head = newNode;
            tail = newNode;
        }
        else{
            tail.right = newNode;
            tail = newNode;
        }

        inorder(root.right);
    }
}
