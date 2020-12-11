// Difficulty : Medium
// Comment : Easier than before
// runtime : 0ms(100%)
class PartitionList_category {
    public ListNode partition(ListNode head, int x) {
        ListNode pre = new ListNode(-1);
        ListNode retPre = pre;
        ListNode aft = new ListNode(-1);
        ListNode retAft = aft;
        while(head != null) {
            if(head.val < x) {
                pre.next = head;
                pre = pre.next;
            } else {
                aft.next = head;
                aft = aft.next;
            }
            head = head.next;
        }
        if(aft != null)
        aft.next = null;
        pre.next = retAft.next;
        return retPre.next;
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