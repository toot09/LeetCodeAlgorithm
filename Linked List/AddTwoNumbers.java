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
class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ret = l1;
        if(l1 == null && l2 == null) return null;
        if(l1 == null) {
            ret = l2;
        } else if(l2 != null){
            ret.val += l2.val;
        }
        if(ret.val >= 10) {
            ret.val = ret.val%10;
            if(ret.next == null) {
                ListNode newNode = new ListNode(1);
                ret.next = newNode;
            }else {
                ret.next.val += 1;   
            }
        }
        if(l1!=null) l1=l1.next;
        if(l2!=null) l2=l2.next;
        ret.next = addTwoNumbers(l1,l2);
        return ret;
    }

//Definition for singly-linked list.
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; 
    }
  }
  
}