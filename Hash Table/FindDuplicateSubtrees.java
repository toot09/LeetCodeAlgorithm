import java.util.*;

class FindDuplicateSubtrees {
    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        List<TreeNode> ret = new ArrayList<>();
        postOrder(root, new HashMap<String, Integer>(), ret);
        return ret;
    }

    public String postOrder(TreeNode root, Map<String, Integer> hm, List<TreeNode> ret) {
        if(root == null) return "#";
        String key = postOrder(root.left,hm,ret) + " " + postOrder(root.right,hm,ret) + " " + String.valueOf(root.val);
        if(hm.getOrDefault(key,0) == 1) ret.add(root);
        hm.put(key,hm.getOrDefault(key,0)+1);
        return key;
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