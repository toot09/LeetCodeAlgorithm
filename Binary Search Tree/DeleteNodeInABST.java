// 450. Delete Node in a BST
// Difficulty : Medium
// Comment : Wow.. Require squeezing brain
// url : https://leetcode.com/problems/delete-node-in-a-bst/

import java.util.*;
class DeleteNodeInABST {
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root==null) return root;
        if(key<root.val) {
            root.left = deleteNode(root.left, key);
        } else if(key>root.val) {
            root.right = deleteNode(root.right, key);
        } else {
            if(root.left==null) return root.right;
            else if(root.right==null) return root.left;
            
            TreeNode min = findMin(root.right);
            root.val = min.val;
            root.right = deleteNode(root.right, root.val);
        }
        return root;
    }
    public TreeNode findMin(TreeNode node) {
        while(node.left!=null) node = node.left;
        return node;
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