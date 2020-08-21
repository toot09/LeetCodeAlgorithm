import java.util.*;
//Iterative!!
class BinaryTreePostorderTraversal_study {
  public List<Integer> postorderTraversal(TreeNode root) {
    LinkedList<Integer> ans = new LinkedList<>();
    Stack<TreeNode> stack = new Stack<>();
    if (root == null) return ans;
    
    stack.push(root);
    while (!stack.isEmpty()) {
      TreeNode cur = stack.pop();
      ans.addFirst(cur.val);
      if (cur.left != null) {
        stack.push(cur.left);
      }
      if (cur.right != null) {
        stack.push(cur.right);
      } 
    }
    return ans;
  }
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
//Recursive
//Runtime: 1 ms
//Memory Usage: 37.3 MB
/*
class BinaryTreePostorderTraversal_study {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> ret = new ArrayList<>();
        if(root == null) return ret;
        if(root.left != null) ret.addAll(postorderTraversal(root.left));
        if(root.right != null) ret.addAll(postorderTraversal(root.right));
        ret.add(root.val);
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
*/