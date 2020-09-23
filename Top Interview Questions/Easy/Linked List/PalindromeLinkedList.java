//Runtime: 1 ms (96.59%)
//Memory Usage: 42 MB (78.26%)
class PalindromeLinkedList_TIQ {
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        fast = head;
        slow = getReverse(slow);
        while(fast!=null && slow!=null) {
            if(fast.val != slow.val) return false;
            fast = fast.next;
            slow = slow.next;
        }
        return true;
    }
    public ListNode getReverse(ListNode node) {
        ListNode pre = null;
        while(node != null) {
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

//Runtime: 2 ms (45.34%)
//Memory Usage: 46.8 MB (7.43%)
/*
class PalindromeLinkedList_TIQ {
    public boolean isPalindrome(ListNode head) {
        if(head==null) return true;
        ListNode node = head;
        ListNode last = head;
        int cnt=0;
        while(head != null) {
            last = head;
            head = head.next;
            cnt++;
        }
        cnt = (int)Math.round(cnt/2);
        head = node;
        for(int i=1 ; i<=cnt ; i++) {
            node = node.next;
        }
        getHalfNode(node);
        while(last!=null && head !=null) {
            if(last.val != head.val) return false;
            last = last.next;
            head = head.next;
        }
        return true;
    }
    public ListNode getHalfNode(ListNode node) {
        if(node.next == null) return node;
        getHalfNode(node.next).next = node;
        node.next = null;
        return node;
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