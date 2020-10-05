class AddTwoNumbers_study {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1==null && l2==null) return null;
        ListNode ret =l1;
        if(l1==null) ret = l2;
        else if(l2!=null) ret.val += l2.val;
        
        if(ret.val>9) {
            if(ret.next!=null) ret.next.val += 1;
            else ret.next = new ListNode(1);
            ret.val %= 10;
        }
        ret.next = addTwoNumbers(l1!=null?l1.next:l1, l2!=null?l2.next:l2);
        return ret;
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