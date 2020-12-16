// Difficulty : Easy
// Comment : ??? (Just do synchronize value data)
class DeleteNodeInALinkedList_Category {
    public void deleteNode(ListNode node) {
        while(node != null) {
            node.val = node.next.val;
            if(node.next.next==null) node.next = null;
            node = node.next;
        }
    }
	//Definition for singly-linked list.
	public class ListNode {
		int val;
		ListNode next;
		ListNode(int x) { val = x; }
	}
}