// Difficulty : Medium
// Comment : Easier than difficulty
class OddEvenLinkedList_category {
    public ListNode oddEvenList(ListNode head) {
        if(head==null) return head;
        ListNode odd = head;
        ListNode even = head.next;
        ListNode evenTmp = even;
        while(even!=null) {
            odd.next = even.next;
            if(odd.next!=null) {
                odd = odd.next;
                even.next = odd.next;            
            }
            even = even.next;
        }
        odd.next = evenTmp;
        return head;
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