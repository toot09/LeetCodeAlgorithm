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
class RemoveLinkedListElements {
    public ListNode removeElements(ListNode head, int val) {
        ListNode ret = new ListNode(0,head);
        ListNode tmp = ret;
        while(tmp.next!=null) {
            if(tmp.next.val == val) {
                tmp.next = tmp.next.next;
            } else {
                tmp = tmp.next;
            }
        }
        
        return ret.next;
    }
}