// 2. Add Two Numbers
// Difficulty : Medium
// Comment : Great Prob. 12700/2692
// url : https://leetcode.com/problems/add-two-numbers/

class AddTwoNumbersGoogle {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1==null) return l2;
        int sum = (l1==null?0:l1.val) + (l2==null?0:l2.val);
        l1.val = sum%10;
        if(sum>9) {
            if(l1.next==null) l1.next = new ListNode(1);
            else l1.next.val+=1;
        }
        l1.next = addTwoNumbers(l1==null?l1:l1.next, l2==null?l2:l2.next);
        return l1;
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