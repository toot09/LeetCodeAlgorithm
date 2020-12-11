// Difficulty : Medium
// Comment : Too much spending time to solving..
// runtime 0ms(100%)
// url : https://leetcode.com/problems/reverse-linked-list-ii/
class ReverseLinkedListII {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        if(m == n) return head;
        ListNode node = new ListNode(0);
        node.next = head;
        ListNode ret = node;

        for(int i=1 ; i<m ; i++) {
            node = node.next;
        }
        ListNode l1 = node;
        node = node.next;
        ListNode pre = null;
        for(int i=1 ; i<=n-m+1 ; i++) {
            ListNode next = node.next;
            node.next = pre;
            pre = node;
            node = next;
        }
        l1.next = pre;
        while(pre.next != null) {
            pre = pre.next;
        }
        pre.next = node;
        return ret.next;
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