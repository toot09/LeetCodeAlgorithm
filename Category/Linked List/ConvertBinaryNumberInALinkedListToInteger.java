// Difficulty : Easy
// Comment : Just easy
class ConvertBinaryNumberInALinkedListToInteger {
    public int getDecimalValue(ListNode head) {
        int ret = 0;
        while(head!=null) {
            ret *= 2;
            ret += head.val;
            head = head.next;
        }
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