//83. Remove Duplicates from Sorted List

class RemoveDuplicatesfromSortedList {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode ret = head;
        ListNode tmp = head.next;
        while(tmp != null) {
            if(head.val != tmp.val) {
                head.next = tmp;
                head = head.next;
            }
            tmp = tmp.next;
        }
        head.next = null;
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