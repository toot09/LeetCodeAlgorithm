// Difficulty : Medium
// Comment : Remember how to solved it.
// url : https://leetcode.com/explore/interview/card/facebook/6/linked-list/319/


class AddTwoNumbersFacebook {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1==null) return l2;
        int sum = l1.val + (l2==null?0:l2.val);
        if(sum>=10) {
            sum %= 10;
            if(l1.next==null) l1.next = new ListNode(1);
            else l1.next.val += 1;
        }
        l1.val = sum;
        l1.next = addTwoNumbers(l1.next, (l2==null?l2:l2.next));
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