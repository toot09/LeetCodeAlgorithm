// Difficulty : Medium
// Comment : Why I confuse to solve it?
// url : https://leetcode.com/problems/reorder-list/
class ReorderList_category {
    public void reorderList(ListNode head) {
        if(head == null) return;
        ListNode fast = head;
        ListNode slow = head;
        while(fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        fast = slow.next;
        ListNode pre = null;
        while(fast != null) {
            ListNode next = fast.next;
            fast.next = pre;
            pre = fast;
            fast = next;
        }
        fast = pre;
        slow.next = null;
        while(head != null) {
            ListNode hNext = head.next;
            head.next = fast;
            head = hNext;
            if(fast != null) {
                ListNode fNext = fast.next;
                fast.next = hNext;
                fast = fNext;
            }
        }
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