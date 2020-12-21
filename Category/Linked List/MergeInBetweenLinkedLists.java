// Difficulty : Medium
// Comment : It is Easier than Difficulty.
class MergeInBetweenLinkedLists_category {
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode ret = new ListNode(0);
        ret.next = list1;
        ListNode node = ret;
        ListNode head = null;
        ListNode tail = null;
        for(int i=0 ; i<=b+1 ; i++) {
            if(i==a) head = node;
            node = node.next;
            if(i==b+1) tail = node;
        }
        head.next = list2;
        while(list2!=null && list2.next!=null) {
            list2 = list2.next;
        }
        if(list2!=null) {
            list2.next = tail;
        } else {
            head.next = tail;
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