// 235. Lowest Common Ancestor of a Binary Search Tree
// Difficulty : Easy
// Comment : Is this Easy? really?
// url : https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/

class LowestCommonAncestorOfABinarySearchTree {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(p.val<root.val && q.val<root.val) root = lowestCommonAncestor(root.left, p, q);
        else if(p.val>root.val && q.val>root.val) root = lowestCommonAncestor(root.right, p, q);
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