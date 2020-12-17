// Difficulty : Medium
// Comment : Solved easier then I thought.
//			 Prior answer used Stack but This code not used.
// url : https://leetcode.com/problems/flatten-a-multilevel-doubly-linked-list/
class FlattenAMultilevelDoublyLinkedList_category {
    public Node flatten(Node head) {
        if(head == null) return head;
        flattenHelper(head);
        return head;
    }

    public Node flattenHelper(Node head) {
        if(head.next == null && head.child == null)
        return head;
        Node ret = new Node(0);
        ret.next = head;
        while(ret.next != null) {
            if(ret.next.child != null) {
                Node next = ret.next.next;
                ret.next.next = ret.next.child;
                ret.next.child.prev = ret.next;
                ret.next.child = null;
                ret = flattenHelper(ret.next.next);
                ret.next = next;
                if(next!=null) next.prev = ret;
                continue;
            }
            ret = ret.next;
        }
        return ret;
    }
	
	// Definition for a Node.
	public class Node {
		public int val;
		public Node prev;
		public Node next;
		public Node child;
    public Node(int val) {
      this.val = val;
    }
	}
}