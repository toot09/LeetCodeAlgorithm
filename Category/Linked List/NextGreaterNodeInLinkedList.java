// Difficulty : Medium
// Comment : I couldn't reach to the answer. I have to try again this!!!!
// url : https://leetcode.com/problems/next-greater-node-in-linked-list/
import java.util.*;
class NextGreaterNodeInLinkedList_category {
    public int[] nextLargerNodes(ListNode head) {
        List<Integer> list = new ArrayList<>();
        for(ListNode node=head ; node!=null ; node = node.next) {
            list.add(node.val);
        }
        int[] ret = new int[list.size()];
        Stack<Integer> s = new Stack<>();
        for(int i=0 ; i<list.size() ; i++) {
            while(!s.isEmpty() && list.get(s.peek())<list.get(i)) {
                ret[s.pop()] = list.get(i);
            }
            s.push(i);
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