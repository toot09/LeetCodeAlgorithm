//Runtime: 0 ms (100%)
//Memory Usage: 39.2 MB (97.39%)
class LinkedListCycle_TIQ {
    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null) {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) return true;
        }
        return false;
    }
	//Definition for singly-linked list.
	class ListNode {
		int val;
		ListNode next;
		ListNode(int x) {
			val = x;
			next = null;
		}
	}
}

//Runtime: 3 ms (19.71%)
//Memory Usage: 39.9 MB (39.98%)
/*
class LinkedListCycle_TIQ {
    public boolean hasCycle(ListNode head) {
        Set<ListNode> hs = new HashSet<>();
        while(head != null) {
            if(hs.contains(head)) {
                return true;
            }
            hs.add(head);
            head = head.next;
        }
        return false;
    }
	//Definition for singly-linked list.
	class ListNode {
		int val;
		ListNode next;
		ListNode(int x) {
			val = x;
			next = null;
		}
	}
}
*/