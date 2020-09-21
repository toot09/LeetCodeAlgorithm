
class RemoveNthNodeFromEndOfList_TIQ {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode ret = new ListNode(0,head);
        ListNode fast = ret;
        ListNode slow = ret;
        for(int i=1 ; i<=n ; i++) {
            fast = fast.next;
        }
        if(fast.next == null) return ret.next.next;
        while(fast.next != null) {
            fast = fast.next;
            slow = slow.next;
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