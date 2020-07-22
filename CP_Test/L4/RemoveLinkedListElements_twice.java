//203. Remove Linked List Elements
class RemoveLinkedListElements_twice {
    public ListNode removeElements(ListNode head, int val) {
        ListNode tmp = new ListNode(0,head);
        ListNode ret = tmp;
        while(tmp.next != null) {
            if(tmp.next.val == val) {
                tmp.next = tmp.next.next;
            } else {
                tmp = tmp.next;
            }
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