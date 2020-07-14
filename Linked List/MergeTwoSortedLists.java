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
 
class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1==null) return l2;
        if(l2==null) return l1;
        if(l1.val <= l2.val) {
            l1.next = mergeTwoLists(l1.next,l2);
            return l1;
        } else {
            l2.next = mergeTwoLists(l1,l2.next);
            return l2;
        }
    }
     // Definition for singly-linked list.
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
 /*
class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode ret = new ListNode(0);
        ListNode head = ret;
        while(l1 != null || l2 != null) {
            if(l1 == null) {
                ret.next = l2;
                break;
            } else if (l2 == null) {
                ret.next = l1;
                break;
            } else {
                if(l2.val <= l1.val) {
                    ret.next = l2;
                    l2 = l2.next;
                    ret = ret.next;
                } else {
                    ret.next = l1;
                    l1 = l1.next;
                    ret = ret.next;
                }
            }
        }
        return head.next;
    }
}
*/