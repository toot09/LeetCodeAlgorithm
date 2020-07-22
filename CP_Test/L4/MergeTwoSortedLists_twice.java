// 21. Merge Two Sorted Lists
// Already studied Algorithm and I remember it!
class MergeTwoSortedLists_twice {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode ret;
        if(l1 == null) return l2;
        if(l2 == null) return l1;
        if(l1.val <= l2.val) {
            ret = l1;
            l1.next = mergeTwoLists(l1.next,l2);
        } else {
            ret = l2;
            l2.next = mergeTwoLists(l1,l2.next);
        }
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