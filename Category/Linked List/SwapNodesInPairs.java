// Difficulty : Medium
// Comment : solved by myself using recursive
// Runtime : 0ms(100%)
class SwapNodesInPairs_category {
    public ListNode swapPairs(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode next = head.next;
        head.next = swapPairs(head.next.next);
        next.next = head;
        return next;
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