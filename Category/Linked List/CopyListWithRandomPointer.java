// Diificulty : Medium
// Comment : This is more efficent than below code(Using HashMap). I didn't find way to code efficiency.
// Runtime : 0ms(100%)
// url : https://leetcode.com/problems/copy-list-with-random-pointer/
import java.util.*;
class CopyListWithRandomPointer_category {
    public Node copyRandomList(Node head) {
        Node node = new Node(0);
        Node ret = node;
        HashMap<Node, Node> hm = new HashMap<>();
        while(head != null) {
            if(!hm.containsKey(head)) hm.put(head, new Node(head.val));
            node.next = hm.get(head);
            if(head.random != null) {
                if(!hm.containsKey(head.random)) hm.put(head.random, new Node(head.random.val));
                node.next.random = hm.get(head.random);
            }
            head = head.next;
            node = node.next;
        }
        return ret.next;
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

// Comment : First attempt code.
// Runtime : 2ms
/*
class CopyListWithRandomPointer_category {
    public Node copyRandomList(Node head) {
        Node node = new Node(0);
        Node ret = node;
        Node org = head;

        while(org != null) {
            Node newNode = new Node(org.val);
            node.next = newNode;
            org = org.next;
            node = node.next;
        }
        org = head;
        Node newHead = ret.next;
        node = ret.next;

        while(org != null) {
            Node loopOrg = head;
            Node loopNew = newHead;
            Node rd = org.random;
            if(rd != null) {
                while(loopOrg != null && loopOrg != rd) {
                    loopOrg = loopOrg.next;
                    loopNew = loopNew.next;
                }
                node.random = loopNew;
            }
            org = org.next;
            node = node.next;
        }
        return ret.next;
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
*/