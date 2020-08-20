import java.util.*;

// Iteratively
class BinaryTreePreorderTraversal {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ret = new ArrayList<>();
        if(root == null) return ret;
        Stack<TreeNode> s = new Stack<>();
        s.push(root);
        while(!s.isEmpty()) {
            TreeNode tmp = s.pop();
            ret.add(tmp.val);
            if(tmp.right != null) {
                s.push(tmp.right);
            }
            if(tmp.left != null) {
                s.push(tmp.left);
            }
        }
        return ret;
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

// Recursive method
/*
class BinaryTreePreorderTraversal {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ret = new ArrayList<>();
        if(root == null) return ret;
        ret.add(root.val);
        if(root.left != null) {
            ret.addAll(preorderTraversal(root.left));
        }
        if(root.right != null) {
            ret.addAll(preorderTraversal(root.right));
        }
        return ret;
    }
}
*/