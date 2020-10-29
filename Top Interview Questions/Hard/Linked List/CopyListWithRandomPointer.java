import java.util.*;
//Runtime: 0 ms (100%)
//Memory Usage: 39.1 MB
class CopyListWithRandomPointer_TIQ {
    public Node copyRandomList(Node head) {
        Map<Node, Node> hm = new HashMap<>();
        Node tmp = new Node(0);
        Node ret = tmp;
        while(head!=null) {
            if(!hm.containsKey(head)) hm.put(head, new Node(head.val));
            tmp.next = hm.get(head);
            tmp = tmp.next;
            if(head.random!=null) {
                if(!hm.containsKey(head.random)) hm.put(head.random, new Node(head.random.val));
                tmp.random = hm.get(head.random);
            }
            head = head.next;
        }
        return ret.next;
    }

	//Definition for a Node.
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