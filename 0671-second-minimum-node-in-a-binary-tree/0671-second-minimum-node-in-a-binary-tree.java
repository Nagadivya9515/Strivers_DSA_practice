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
    private long first_min=Long.MAX_VALUE;
    private long second_min=Long.MAX_VALUE;
    public int findSecondMinimumValue(TreeNode root) {
        dfs(root);
        return second_min==Long.MAX_VALUE?-1:(int)second_min;
    }

    private void dfs(TreeNode node)
    {
        if(node == null)
        {
            return;
        }
        if(node.val<first_min)
        {
            second_min=first_min;
            first_min=node.val;
        }
        else if(node.val>first_min && node.val<second_min)
        {
            second_min=node.val;
        }
        dfs(node.left);
        dfs(node.right);
    }
}