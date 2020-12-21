// Difficulty : Medium
// Comment : Awesome!! How can come up with this idea? unbelievable...
// url : https://leetcode.com/problems/remove-zero-sum-consecutive-nodes-from-linked-list/
import java.util.*;
class RemoveZeroSumConsecutiveNodesFromLinkedList_category {
    public ListNode removeZeroSumSublists(ListNode head) {
        ListNode ret = new ListNode(0);
        ret.next = head;
        Map<Integer, ListNode> hm = new HashMap<>();
        int sum = 0;
        for(ListNode node = ret ; node!=null ; node = node.next) {
            sum += node.val;
            hm.put(sum, node);
        }
        sum = 0;
        for(ListNode node = ret ; node!=null ; node = node.next) {
            sum += node.val;
            node.next = hm.get(sum).next;
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