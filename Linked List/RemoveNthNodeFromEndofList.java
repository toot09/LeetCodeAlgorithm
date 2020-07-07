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
// One Pass !!
class RemoveNthNodeFromEndofList {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode first = head;
        ListNode second = head;
        for(int i=1 ; i<=n ; i++) {
            first = first.next;
        }
        if(first == null) {
            return head.next;
        }
        while(first.next != null) {
            first = first.next;
            second = second.next;
        }
        second.next = second.next.next;
        return head;
       
    }
}

// Two Pass !!
/*
class RemoveNthNodeFromEndofList {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode newNode = head;
        int size = 0;
        while(newNode != null) {
            size++;
            newNode = newNode.next;
        }
        newNode = head;
        if(n==size) {
            return head.next;
        }
        while(size > (n+1)) {
            newNode = newNode.next;
            size--;
        }
        newNode.next = newNode.next.next;
        return head;
    }
}
*/