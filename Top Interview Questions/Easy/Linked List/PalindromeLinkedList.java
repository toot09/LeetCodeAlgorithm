//Runtime: 2 ms (45.34%)
//Memory Usage: 46.8 MB (7.43%)
class PalindromeLinkedList_TIQ {
    public boolean isPalindrome(ListNode head) {
        if(head==null) return true;
        ListNode node = head;
        ListNode last = head;
        int cnt=0;
        while(head != null) {
            last = head;
            head = head.next;
            cnt++;
        }
        cnt = (int)Math.round(cnt/2);
        head = node;
        for(int i=1 ; i<=cnt ; i++) {
            node = node.next;
        }
        getHalfNode(node);
        while(last!=null && head !=null) {
            if(last.val != head.val) return false;
            last = last.next;
            head = head.next;
        }
        return true;
    }
    public ListNode getHalfNode(ListNode node) {
        if(node.next == null) return node;
        getHalfNode(node.next).next = node;
        node.next = null;
        return node;
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