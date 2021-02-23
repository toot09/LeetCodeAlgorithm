class PopulatingNextRightPointersInEachNodeII {
    public Node connect(Node root) {
        Node ret = root;
        while(root!=null) {
            Node pre = new Node(0);
            Node child = null;
            while(root!=null) {
                if(root.left!=null) {
                    pre.next = root.left;
                    pre = pre.next;
                    if(child==null) child = root.left;
                }
                if(root.right!=null) {
                    pre.next = root.right;
                    pre = pre.next;
                    if(child==null) child = root.right;
                }
                root = root.next;
            }
            root = child;
        }
        return ret;
    }
	// Definition for a Node.
	class Node {
		public int val;
		public Node left;
		public Node right;
		public Node next;

		public Node() {}
		
		public Node(int _val) {
			val = _val;
		}

		public Node(int _val, Node _left, Node _right, Node _next) {
			val = _val;
			left = _left;
			right = _right;
			next = _next;
		}
	}
}