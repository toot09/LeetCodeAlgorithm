// Difficulty : Easy
// Comment : Can solve beacause of studying before
class LinkedListCycle_category {
    public boolean hasCycle(ListNode head) {
        if(head==null) return false;
        ListNode fast = head.next;
        ListNode slow = head;
        while(fast!=null && fast.next !=null) {
            if(fast == slow) return true;
            fast = fast.next.next;
            slow = slow.next;
        }
        return false;
    }
	//Definition for singly-linked list.
	class ListNode {
	    int val;
	    ListNode next;
	    ListNode(int x) {
	        val = x;
	        next = null;
	    }
	}
}