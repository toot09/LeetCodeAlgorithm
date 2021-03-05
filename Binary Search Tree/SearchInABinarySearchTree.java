// 700. Search in a Binary Search Tree
// Difficulty : Easy
// Comment : Easy!! It's first time to meeting at BST
// url : https://leetcode.com/problems/search-in-a-binary-search-tree/


class SearchInABinarySearchTree {
    public TreeNode searchBST(TreeNode root, int val) {
        while(root!=null) {
            if(root.val==val) return root;
            else if(val<root.val) root = root.left;
            else root = root.right;
        }
        return root;
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