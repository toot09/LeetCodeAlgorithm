//Runtime: 0 ms (100%)
//Memory Usage: 39.5 MB (42.30%)
class ReverseLinkedList_TIQ {
    public ListNode reverseList(ListNode head) {
        return getReverse(head);
    }
    public ListNode getReverse(ListNode node) {
        ListNode pre = null;
        while(node!=null) {
            ListNode next = node.next;
            node.next = pre;
            pre = node;
            node = next;
        }
        return pre;
    }
	//Definition for singly-linked list.
	public class ListNode {
		int val;
		ListNode next;
		ListNode() {}
		ListNode(int val) { this.val = val; }
		ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	}
}

//Runtime: 0 ms
//Memory Usage: 39.4 MB
/*
class ReverseLinkedList_TIQ {
    public ListNode reverseList(ListNode head) {
        if(head==null) return head;
        ListNode ret = head;
        while(ret.next != null) {
            ret = ret.next;
        }
        getReverseNode(head);
        return ret;
    }
    public ListNode getReverseNode(ListNode head) {
        if(head.next == null) return head;
        getReverseNode(head.next).next = head;
        head.next = null;
        return head;
    }

	//Definition for singly-linked list.
	public class ListNode {
		int val;
		ListNode next;
		ListNode() {}
		ListNode(int val) { this.val = val; }
		ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	}
}
*/