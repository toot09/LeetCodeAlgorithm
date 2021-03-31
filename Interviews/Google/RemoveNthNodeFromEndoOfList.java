// 19. Remove Nth Node From End of List
// Difficulty : Medium
// Comment : One of most important basic of LinkedList
// url : https://leetcode.com/problems/remove-nth-node-from-end-of-list/

class RemoveNthNodeFromEndoOfListGoogle {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode ret = new ListNode(-1);
        ret.next = head;
        ListNode slow = ret;
        ListNode fast = ret;
        while(n-->0) fast = fast.next;
        while(fast.next!=null) {
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
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