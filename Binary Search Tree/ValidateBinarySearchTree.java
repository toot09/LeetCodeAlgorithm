// 98. Validate Binary Search Tree
// Difficulty : Medium
// Comment : Basic is most important
// url : https://leetcode.com/problems/validate-binary-search-tree/

import java.util.*;
class ValidateBinarySearchTree {
    public boolean isValidBST(TreeNode root) {
        Stack<TreeNode> s = new Stack<>();
        TreeNode pre = null;
        while(root!=null || !s.isEmpty()) {
            while(root!=null) {
                s.push(root);
                root = root.left;
            }
            TreeNode node = s.pop();
            if(pre!=null && pre.val>=node.val) return false;
            pre = node;
            root = node.right;
        }
        return true;
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