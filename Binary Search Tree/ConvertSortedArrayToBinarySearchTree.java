// 108. Convert Sorted Array to Binary Search Tree
// Difficulty : Easy
// Comment : Great basic Prob.
// url : https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/

class ConvertSortedArrayToBinarySearchTree {
    public TreeNode sortedArrayToBST(int[] nums) {
        return setTreeNode(nums, 0, nums.length-1);
    }
    public TreeNode setTreeNode(int[] nums, int s, int e) {
        if(s>e) return null;
        int mid = s+(e-s)/2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = setTreeNode(nums, s, mid-1);
        node.right = setTreeNode(nums, mid+1, e);
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