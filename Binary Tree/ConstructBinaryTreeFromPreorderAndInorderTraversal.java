// url : https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/
import java.util.*;
class ConstructBinaryTreeFromPreorderAndInorderTraversal {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        Map<Integer, Integer> hm = new HashMap<>();
        for(int i=0 ; i<inorder.length ; i++) {
            hm.put(inorder[i],i);
        }
        return helper(preorder, 0, preorder.length-1, inorder, 0 ,inorder.length-1, hm);
    }
    public TreeNode helper(int[] preorder, int ps, int pe, int[] inorder, int is, int ie, Map<Integer, Integer> hm) {
        if(ps>pe || is>ie) return null;
        TreeNode node = new TreeNode(preorder[ps]);
        int idx = hm.get(node.val);
        node.left = helper(preorder, ps+1, ps+idx-is, inorder, is, idx-1, hm);
        node.right = helper(preorder, ps+idx-is+1, pe, inorder, idx+1, ie, hm);
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