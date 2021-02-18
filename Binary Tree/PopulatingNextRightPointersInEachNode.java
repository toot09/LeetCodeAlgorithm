//url : https://leetcode.com/explore/learn/card/data-structure-tree/133/conclusion/994/

class PopulatingNextRightPointersInEachNode {
    public Node connect(Node root) {
        Node ret = root;
        while(root!=null) {
            Node cur = root;
            while(cur!=null) {
                if(cur.left!=null) cur.left.next = cur.right;
                if(cur.right!=null && cur.next!=null) cur.right.next = cur.next.left;
                cur = cur.next;
            }
            root = root.left;
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