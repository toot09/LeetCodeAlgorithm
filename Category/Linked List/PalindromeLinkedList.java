// Difficulty : Easy
// Comment : Just easy.
class PalindromeLinkedList_category {
    public boolean isPalindrome(ListNode head) {
        if(head==null || head.next==null) return true;
        ListNode fast = head;
        ListNode slow = head;
        while(fast.next!=null && fast.next.next!=null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        fast = slow.next;
        slow.next = null;
        ListNode pre = null;
        while(fast!=null) {
            ListNode next = fast.next;
            fast.next = pre;
            pre = fast;
            fast = next;
        }
        while(head!=null && pre!=null) {
            if(head.val!=pre.val) return false;
            head = head.next;
            pre = pre.next;
        }
        return true;
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