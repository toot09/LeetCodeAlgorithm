// Difficulty : Medium
// Comment : Solved once attempt
// Runtime : 0ms (100%)
// url : https://leetcode.com/problems/remove-nth-node-from-end-of-list/
class RemoveNthNodeFromEndOfList_category {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode fast = head;
        ListNode slow = head;
        for(int i=1 ; i<=n ; i++) {
            fast = fast.next;
        }
        if(fast==null) return head.next;
        while(fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
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