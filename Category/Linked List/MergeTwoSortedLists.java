// Difficulty : Easy
// Comment : Just easy.
class MergeTwoSortedLists_category {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode ret = new ListNode(0);
        helper(ret, l1, l2);
        return ret.next;
    }
    
    public void helper(ListNode head, ListNode l1, ListNode l2) {
        if(l1==null || l2==null) {
            head.next = (l1==null ? l2 : l1);
            return;
        }
        if(l1.val<l2.val) {
            head.next = l1;
            helper(head.next, l1.next, l2);
        } else {
            head.next = l2;
            helper(head.next, l1, l2.next);
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