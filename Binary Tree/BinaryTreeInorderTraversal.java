import java.util.*;
//Iteratively
//Runtime: 1 ms
//Memory Usage: 39.6 MB
class BinaryTreeInorderTraversal_2 {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ret = new ArrayList<>();
        if(root == null) return ret;
        Stack<TreeNode> s = new Stack<>();
        
        s.push(root);
        while(!s.isEmpty()) {
            while(s.peek().left != null) {
                s.push(s.peek().left);
            }
            TreeNode tmp = s.pop();
            ret.add(tmp.val);
            while(tmp.right == null && !s.isEmpty()) {
                tmp = s.pop();
                ret.add(tmp.val);
            }
            if(tmp.right != null) {
                s.push(tmp.right);
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



//recursive
//Runtime: 0 ms
//Memory Usage: 37.7 MB
/*
class BinaryTreeInorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ret = new ArrayList<>();
        if(root == null) return ret;
        if(root.left!=null) ret.addAll(inorderTraversal(root.left));
        ret.add(root.val);
        if(root.right!=null) ret.addAll(inorderTraversal(root.right));
        return ret;
    }
}
*/