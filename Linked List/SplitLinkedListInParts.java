// Difficulty : Medium
// Comment : First try and correct
// url : https://leetcode.com/problems/split-linked-list-in-parts/
class SplitLinkedListInParts_category {
    public ListNode[] splitListToParts(ListNode root, int k) {
        ListNode[] ret = new ListNode[k];
        if(root==null) return ret;
        ListNode head = root;
        int len = 0;
        while(head!=null) {
            head = head.next;
            len++;
        }
        int remain = len%k;
        len /= k;
        for(int i=0 ; i<k && root!=null ; i++) {
            int j = len+(i<remain?1:0);
            ret[i] = root;
            while(root!=null && j-->1) {
                root = root.next;
            }
            if(root==null) break;
            ListNode next = root.next;
            root.next = null;
            root = next;
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