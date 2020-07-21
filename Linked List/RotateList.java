class RotateList {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null) return head;
        int len = 0;
        ListNode fast = head;
        ListNode slow = head;
        while(fast != null) {
            fast = fast.next;
            len++;
        }
        k = k%len;
        if(k==0) return head;
        fast = head;
        while(k-- > 0) {
            fast = fast.next;
        }
        while(fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        ListNode ret = slow.next;
        slow.next = null;
        fast.next = head;
        return ret;
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