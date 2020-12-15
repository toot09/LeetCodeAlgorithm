// Difficulty : Medium
// Comment : I attempted to solving with difficult method. (in-place). Making new Var (ret) and add new node is greate method
// url : https://leetcode.com/problems/insertion-sort-list/submissions/
class InsertionSortList_category {
    public ListNode insertionSortList(ListNode head) {
        if(head==null) return head;
        ListNode ret = new ListNode(0);
        ListNode node = head;
        while(node!=null) {
            ListNode next = node.next;
            ListNode pre = ret;
            while(pre.next!=null && pre.next.val<node.val) {
                pre = pre.next;
            }
            node.next = pre.next;
            pre.next = node;
            node = next;
        }
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