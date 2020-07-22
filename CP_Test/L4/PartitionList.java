
// 86. Partition List
// Requirement : Time complext O(n), space complexity O(1)
class PartitionList {
    public ListNode partition(ListNode head, int x) {
        ListNode lowNode = new ListNode(0);
        ListNode highNode = new ListNode(0);
        ListNode ret = lowNode;
        ListNode hightTmp = highNode;
        while(head!=null) {
            if(head.val < x) {
                lowNode.next = head;
                lowNode = lowNode.next;
            } else {
                highNode.next = head;
                highNode = highNode.next;
            }
            head = head.next;
        }
        lowNode.next = hightTmp.next;
        highNode.next = null;
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