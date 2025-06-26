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
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null)
            return 0;

        int leftDiam = diameterOfBinaryTree(root.left);
        int leftHeight = height(root.left);
        int rightDiam = diameterOfBinaryTree(root.right);
        int rightHeight = height(root.right);
        //bhai yahan pe diameter means uska path calculate karna na ki number of nodes , ye wali line number of nodes find karne k liye valid diameter ki 
       // int selfDiam = leftHeight + rightHeight + 1;

       //calculated diameter only
       int selfDiam = leftHeight + rightHeight ;

        return Math.max(selfDiam,Math.max(leftDiam,rightDiam));
    }

    int height(TreeNode root)
    {
        if(root==null)
            return 0;

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        return 1 + Math.max(leftHeight,rightHeight);
    }
}