import java.util.*;
//Runtime: 6 ms (41.24%)
//Memory Usage: 47.9 MB

class SortList_TIQ {
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode slow = head;
        ListNode fast = head;
        ListNode pre = head;
        while(fast!=null && fast.next!=null) {
            pre = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        pre.next = null;
        ListNode l1 = sortList(head);
        ListNode l2 = sortList(slow);
        
        return merge(l1,l2);
    }
    
    public ListNode merge(ListNode l1, ListNode l2) {
        ListNode tmp = new ListNode(0);
        ListNode ret = tmp;
        while(l1!=null && l2!=null) {
            if(l1.val <= l2.val) {
                tmp.next = l1;
                l1 = l1.next;
            } else {
                tmp.next = l2;
                l2 = l2.next;
            }
            tmp = tmp.next;
        }
        if(l1==null) tmp.next = l2;
        if(l2==null) tmp.next = l1;
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
//Runtime: 17 ms (14.66%)
//Memory Usage: 49 MB
/*
class SortList_TIQ {
    public ListNode sortList(ListNode head) {
        PriorityQueue<ListNode> pq = new PriorityQueue<>((a,b)->{
            return a.val - b.val;
        });
        while(head!=null) {
            pq.offer(head);
            head = head.next;
        }
        ListNode tmp = new ListNode(0);
        ListNode ret = tmp;
        while(!pq.isEmpty()) {
            tmp.next = pq.poll();
            tmp = tmp.next;
            tmp.next = null;
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
*/