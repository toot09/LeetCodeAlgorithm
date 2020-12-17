// Difficulty : Medium
// Comment : I Could come up with idea of using hashset
// url : https://leetcode.com/problems/linked-list-components/
import java.util.*;
class LinkedListComponents_category {
    public int numComponents(ListNode head, int[] G) {
        Set<Integer> hs = new HashSet<>();
        for(int n : G) hs.add(n);
        int ret = 0;
        while(head!=null) {
            if(hs.contains(head.val)) {
                ret++;
                while(head!=null && hs.contains(head.val)) {
                    head = head.next;
                }
            }
            if(head==null) break;
            head = head.next;
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