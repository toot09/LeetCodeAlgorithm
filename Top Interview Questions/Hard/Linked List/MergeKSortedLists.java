import java.util.*;
//Runtime: 4 ms (81.50%)
//Memory Usage: 40.7 MB
class MergeKSortedLists_TIQ {
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> pq = new PriorityQueue<>((a,b)->{
            return a.val - b.val; 
        });
        for(ListNode node : lists) {
            if(node!=null) pq.offer(node);
        }
        ListNode tmp = new ListNode(0);
        ListNode ret = tmp;
        while(pq.size()>0) {
            ListNode pqNode = pq.poll();
            tmp.next = pqNode;
            tmp = tmp.next;
            if(pqNode.next != null) pq.offer(pqNode.next);
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

//Runtime: 225 ms (10.26%)
//Memory Usage: 40.5 MB
/*
class MergeKSortedLists_TIQ {
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length == 0) return null;
        ListNode head = new ListNode(0);
        ListNode ret = head;
        while(true) {
          int min = Integer.MAX_VALUE;
          int idx = 0;
          for(int i=0 ; i<lists.length ; i++) {
            if(lists[i] != null && lists[i].val <= min) {
              idx = i;
              min = lists[i].val;
            }
          }
          if(lists[idx] == null) break;
          head.next = lists[idx];
          head = head.next;
          lists[idx] = lists[idx].next;
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