//Recursive
class SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
        return helper(root, root);
    }
    
    public boolean helper(TreeNode root1, TreeNode root2) {
        if(root1 == null && root2 == null) return true;
        if(root1 == null || root2 == null) return false;
        return (root1.val == root2.val) && helper(root1.left,root2.right) && helper(root1.right,root2.left);
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
/*
//Iteratively
class SymmetricTree {
	public boolean isSymmetric(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        q.add(root);
        while (!q.isEmpty()) {
            TreeNode t1 = q.poll();
            TreeNode t2 = q.poll();
			//continue!!
            if (t1 == null && t2 == null) continue;
            if (t1 == null || t2 == null) return false;
            if (t1.val != t2.val) return false;
            q.add(t1.left);
            q.add(t2.right);
            q.add(t1.right);
            q.add(t2.left);
        }
        return true;
    }
}
*/
/*
//Iteratively (My CODE)
class SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
        if(root == null) return true;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()) {
            int size = q.size();
            List<String> l = new ArrayList<>();
            for(int i=1 ; i<=size ; i++) {
                TreeNode tmp = q.poll();
                if(tmp.left == null) {
                    l.add("null");
                } else {
                    l.add(tmp.left.val+"");
                    q.offer(tmp.left);
                }
                if(tmp.right == null) {
                    l.add("null");
                } else {
                    l.add(tmp.right.val+"");
                    q.offer(tmp.right);
                }
            }
            for(int i=0 ; i<l.size()/2 ; i++) {
                if(!l.get(i).equals(l.get(l.size()-i-1))) {
                    return false;
                }
            }   
        }
        return true;
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