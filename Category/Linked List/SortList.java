// Difficulty : Medium
// Comment : I couldn't solve it. I have to coding this problem
// url : https://leetcode.com/problems/sort-list/submissions/
class SortList_category {
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode fast = head;
        ListNode slow = head;
        while(fast.next!=null && fast.next.next!=null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        fast = slow.next;
        slow.next = null;
        ListNode n1 = sortList(head);
        ListNode n2 = sortList(fast);
        return merge(n1,n2);
    }
    public ListNode merge(ListNode n1, ListNode n2) {
        ListNode node = new ListNode(0);
        ListNode ret = node;
        while(n1!=null && n2!=null) {
            if(n1.val<n2.val) {
                node.next = n1;
                n1 = n1.next;
            } else {
                node.next = n2;
                n2 = n2.next;
            }
            node = node.next;
        }
        if(n1==null) node.next = n2;
        else node.next = n1;
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