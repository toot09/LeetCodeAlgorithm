
// url : https://leetcode.com/problems/construct-binary-tree-from-inorder-and-postorder-traversal/
import java.util.*;
class ConstructBinaryTreeFromInorderAndPostorderTraversal {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        Map<Integer, Integer> hm = new HashMap<>();
        for(int i=0 ; i<inorder.length ; i++) {
            hm.put(inorder[i],i);
        }
        return helper(inorder, 0, inorder.length-1, postorder, 0, postorder.length-1, hm);
    }
    public TreeNode helper(int[] inorder, int is, int ie, int[] postorder, int ps, int pe, Map<Integer, Integer> hm) {
        if(is>ie || ps>pe) return null;
        TreeNode node = new TreeNode(postorder[pe]);
        int idx = hm.get(node.val);
        node.left = helper(inorder, is, idx-1, postorder, ps, ps+idx-is-1, hm);
        node.right = helper(inorder, idx+1, ie, postorder, ps+idx-is, pe-1, hm);
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