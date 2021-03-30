// 23. Merge k Sorted Lists
// Difficulty : Hard
// Comment : Remebered!
// url : https://leetcode.com/problems/merge-k-sorted-lists/


import java.util.*;
class MergeKSortedLists {
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode ret = new ListNode(-1);
        ListNode node = ret;
        PriorityQueue<ListNode> pq = new PriorityQueue<>((a,b)->{
            return a.val-b.val;
        });
        for(ListNode list : lists) if(list!=null) pq.offer(list);
        while(pq.size()>0) {
            ListNode tmp = pq.poll();
            node.next = tmp;
            node = node.next;
            if(tmp.next!=null) pq.offer(tmp.next);
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