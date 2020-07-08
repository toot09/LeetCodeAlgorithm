/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
 // My code
class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        if(head==null || head.next==null) return head;
        return getReverse(head, head);
    }
    // n  t
    // 1->2->3->4->5->NULL
    private ListNode getReverse(ListNode head, ListNode node) {
        ListNode tmp = node.next;
        node.next = node.next.next;
        tmp.next = head;
        head = tmp;
        if(node.next != null) {
            head = getReverse(head,node);
        }
        return head;
    }
}

// Solution Code
/*
public ListNode reverseList(ListNode head) {
    if (head == null || head.next == null) return head;
    ListNode p = reverseList(head.next);
    head.next.next = head;
    head.next = null;
    return p;
}
*/