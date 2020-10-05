//Runtime: 1 ms (99.04%)
//Memory Usage: 42 MB (89.90%)
class IntersectionOfTwoLinkedLists_TIQ {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode tmpA = headA;
        ListNode tmpB = headB;
        while(tmpA != null || tmpB != null) {
            if(tmpA == null) {
                headB = headB.next;
                tmpB = tmpB.next;
            } else if(tmpB == null) {
                headA = headA.next;
                tmpA = tmpA.next;
            } else {
                tmpA = tmpA.next;
                tmpB = tmpB.next;
            }
        }
        while(headA != null) {
            if(headA == headB) {
                break;
            }
            headA = headA.next;
            headB = headB.next;
        }
        return headA;
    }
	//Definition for singly-linked list.
	public class ListNode {
		int val;
		ListNode next;
		ListNode(int x) {
			val = x;
			next = null;
		}
	}
}