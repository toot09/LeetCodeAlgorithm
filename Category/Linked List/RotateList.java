// Difficulty : Medium
// Comment : easy
// Runtime 0ms(100%)
class RotateList_category {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null) return head;
        ListNode node = head;
        int len = 1;
        while(node.next != null) {
            len++;
            node = node.next;
        }
        k %= len;
        if(k == 0) return head;
        k = len - k;
        ListNode tmp = head;
        for(int i = 1; i < k; i++) {
            tmp = tmp.next;
        }
        ListNode ret = tmp.next;
        tmp.next = null;
        node.next = head;
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