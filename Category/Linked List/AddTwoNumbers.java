
// Difficulty : Medium
// Comment : I can remember basic of LinkedList. It was easy.
// Runtime : 1ms(100%)
//https://leetcode.com/problems/add-two-numbers/
class AddTwoNumbers_category {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1==null) return l2;
        if(l2==null && l1.val<10) return l1;
        int add = (l2==null ? 0 : l2.val);
        l1.val += add;
        if(l1.val>=10) {
            l1.val %= 10;
            if(l1.next==null) {
                l1.next = new ListNode(1);
            } else {
                l1.next.val += 1;
            }
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

