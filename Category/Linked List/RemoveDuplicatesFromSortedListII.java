// Difficulty : Medium
// Comment : I confused for just second but I reallized problem.
// Runtime : 0ms(100%)
// url : https://leetcode.com/problems/remove-duplicates-from-sorted-list-ii/

class RemoveDuplicatesFromSortedListII_category {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null) return head;
        if(head.val == head.next.val) {
            while(head.next != null && head.val == head.next.val) {
                head = head.next;
            }
            head = head.next;
        }
        if(head != null) {
            if(head.next != null && head.val == head.next.val) head = deleteDuplicates(head);
            else head.next = deleteDuplicates(head.next);
        }
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