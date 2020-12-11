// Difficulty : Easy
// Comment : It was harder than I thought. but I solved.
// runtime 0ms(100%)
// url: https://leetcode.com/problems/remove-duplicates-from-sorted-list/
class RemoveDuplicatesFromSortedList_category {
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null || head.next == null) return head;
        ListNode node = head;
        while(node != null && head.val == node.val) {
            node = node.next;
        }
        head.next = deleteDuplicates(node);
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