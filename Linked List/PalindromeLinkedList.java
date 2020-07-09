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
class PalindromeLinkedList {
    public boolean isPalindrome(ListNode head) {
        if(head==null || head.next == null) return true;
        ListNode tmp = head;
        ListNode newHead = new ListNode(tmp.val);
        while(tmp.next != null) {
            tmp = tmp.next;
            ListNode nxt = new ListNode(tmp.val, newHead);
            newHead = nxt;
        }
        while(head!=null){
            if(head.val != newHead.val) return false;
            head = head.next;
            newHead = newHead.next;
        }
        return true;
    }
}