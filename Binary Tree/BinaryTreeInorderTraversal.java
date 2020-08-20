
//Recursive Method
//Runtime: 0 ms
//Memory Usage: 37.9 MB
class BinaryTreeInorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ret = new ArrayList<>();
        if(root == null) return ret;
        if(root.left != null) ret.addAll(inorderTraversal(root.left));
        ret.add(root.val);
        if(root.right != null) ret.addAll(inorderTraversal(root.right));
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