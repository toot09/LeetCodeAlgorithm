// 138. Copy List with Random Pointer
// Difficulty : Medium
// Comment : Almost close to efficiency solution. Anyway solved it
// url : https://leetcode.com/problems/copy-list-with-random-pointer/


import java.util.*;
class CopyListWithRandomPointer {
    public Node copyRandomList(Node head) {
        Map<Node, Node> hm = new HashMap<>();
        Node node = head;
        while(node!=null) {
            hm.put(node, new Node(node.val));
            node = node.next;
        }
        node = head;
        while(node!=null) {
            hm.get(node).next = hm.get(node.next);
            hm.get(node).random = hm.get(node.random);
            node = node.next;
        }
        return hm.get(head);
    }
	// Definition for a Node.
	class Node {
		int val;
		Node next;
		Node random;

		public Node(int val) {
			this.val = val;
			this.next = null;
			this.random = null;
		}
	}
}