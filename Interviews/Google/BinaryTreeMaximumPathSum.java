// 124. Binary Tree Maximum Path Sum
// Difficulty : Hard
// Comment : It is easier than difficulty when got strong basic
// url : https://leetcode.com/problems/binary-tree-maximum-path-sum/



class BinaryTreeMaximumPathSum {
    private int maxLen = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        helper(root);
        return maxLen;
    }
    public int helper(TreeNode node) {
        if(node==null) return 0;
        int left = Math.max(0, helper(node.left));
        int right = Math.max(0, helper(node.right));
        maxLen = Math.max(maxLen, left+right+node.val);
        return Math.max(left, right)+node.val;
    }
	//Definition for a binary tree node.
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode() {}
		TreeNode(int val) { this.val = val; }
		TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}
}