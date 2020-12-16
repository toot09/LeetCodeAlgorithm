// Difficulty : Easy
// Comment : Just easy
class RemoveLinkedListElemnets_category {
    public ListNode removeElements(ListNode head, int val) {
        ListNode node = new ListNode(0);
        node.next = head;
        ListNode ret = node;
        while(node.next!=null) {
            if(node.next.val==val) {
                node.next = node.next.next;
                continue;
            }
            node = node.next;
        }
        return ret.next;
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