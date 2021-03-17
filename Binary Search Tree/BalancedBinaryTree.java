// 110. Balanced Binary Tree
// Difficulty : Easy
// Comment : Great Prob!
// url : https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/

import java.util.*;
class BalancedBinaryTree {
    public boolean isBalanced(TreeNode root) {
        if(root==null) return true;
        int left = getDepth(root.left);
        int right = getDepth(root.right);
        return Math.abs(left-right)<=1 && isBalanced(root.right) && isBalanced(root.left);
    }
    public int getDepth(TreeNode node) {
        if(node==null) return 0;
        return Math.max(getDepth(node.left),getDepth(node.right))+1;
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