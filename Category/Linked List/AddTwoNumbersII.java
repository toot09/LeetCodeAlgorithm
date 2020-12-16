// Difficulty : Medium
// Comment : Remember! If problem is adding number, Stack function is one of the answer
// url : https://leetcode.com/problems/add-two-numbers-ii/
import java.util.*;
class AddTwoNumbersII_category {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<ListNode> s1 = new Stack<>();
        Stack<ListNode> s2 = new Stack<>();
        while(l1!=null || l2!=null) {
            if(l1!=null) {
                s1.push(l1);
                l1 = l1.next;
            }
            if(l2!=null) {
                s2.push(l2);
                l2 = l2.next;
            }
        }
        int upper = 0;
        ListNode pre = null;
        while(!s1.isEmpty() || !s2.isEmpty()) {
            ListNode n1 = !s1.isEmpty()?s1.pop():null;
            ListNode n2 = !s2.isEmpty()?s2.pop():null;
            if(n1!=null) {
                n1.val += (upper+(n2==null?0:n2.val));
                n1.next = pre;
                pre = n1;
            } else {
                n2.val += (upper+(n1==null?0:n1.val));
                n2.next = pre;
                pre = n2;
            }
            if(pre.val>=10) {
                pre.val %= 10;
                upper = 1;
            } else {
                upper = 0;
            }
        }
        ListNode ret = new ListNode(1);
        ret.next = pre;
        if(upper>0) return ret;
        else return ret.next;
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