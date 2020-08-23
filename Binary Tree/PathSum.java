import java.util.*;
//Recursive
class PathSum {
    public boolean hasPathSum(TreeNode root, int sum) {
        if(root==null) return false;
        if(root.left == null && root.right == null) {
            if(root.val == sum) return true;
            else return false;
        }
        boolean left = false;
        if(root.left != null) {
            root.left.val += root.val;
            left = hasPathSum(root.left,sum);
        }
        boolean right = false;
        if(root.right != null) {
            root.right.val += root.val;
            right = hasPathSum(root.right,sum);
        }
        return left||right;
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

//Iteratively
/*
class PathSum {
    public boolean hasPathSum(TreeNode root, int sum) {
        if(root == null) return false;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()) {
            TreeNode tmp = q.poll();
            if(tmp.left == null && tmp.right == null && tmp.val == sum) return true;
            if(tmp.left != null) {
                tmp.left.val += tmp.val;
                q.offer(tmp.left);
            }
            if(tmp.right != null) {
                tmp.right.val += tmp.val;
                q.offer(tmp.right);
            }
        }
    return false;
    }
}
*/