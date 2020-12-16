// Difficulty : Easy
// Comment : Great problem.
// url : https://leetcode.com/problems/intersection-of-two-linked-lists/
class IntersectionOfTwoLinkedLists_category {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode tmpA = headA;
        ListNode tmpB = headB;
        while(tmpA!=null || tmpB!=null) {
            if(tmpA!=null && tmpB!=null) {
                tmpA = tmpA.next;
                tmpB = tmpB.next;
            } else if(tmpA!=null) {
                headA = headA.next;
                tmpA = tmpA.next;
            } else {
                headB = headB.next;
                tmpB = tmpB.next;
            }
        }
        while(headA!=null && headB!=null) {
            if(headA==headB) return headA;
            headA = headA.next;
            headB = headB.next;
        }
        return null;
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
