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
 // Use Loop : O(N) / Variable : O(1)
class PalindromeLinkedList {


// Definition for singly-linked list.
  public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

    public boolean isPalindrome(ListNode head) {
        if(head==null || head.next == null) return true;
        ListNode fast = head;
        ListNode slow = head;
        boolean odd = false;
        while(fast.next != null) {
            fast = fast.next;
            if(fast.next != null) {
                fast = fast.next;
                if(fast.next != null) {
                    slow = slow.next;
                } else {
                    odd = true;
                }
            }
        }
        fast = slow.next;
        if(odd) {
            fast = fast.next;
        }
        slow = reverse(head, slow);
        while(fast != null) {
            if(fast.val != slow.val) {
                return false;
            }
            fast = fast.next;
            slow = slow.next;
        }
        return true;
    }
    
    
    private ListNode reverse(ListNode head, ListNode middle) {
        if(head == middle) {
            return head;
        }
        ListNode ret = reverse(head.next, middle);
        head.next.next = head;
        head.next = null;
        return ret;
    }
    
}
 // Use Loop : O(N) / Variable : O(N)
 /*
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
*/