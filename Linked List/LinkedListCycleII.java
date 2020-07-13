/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
/*
xxxxxx
  x  x
  xxxx
A : 2 (Loop전까지 step)
B : 10 (Loop step)
X : walker 와 runner가 만난 step
walker = A + X
runner = A + X + B*n
2*walker = runner
A + X = B
*/
public class LinkedListCycleII {

// Definition for singly-linked list.
  public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
     }
 }


    public ListNode detectCycle(ListNode head) {
        if(head == null) return null;
        ListNode walker = head;
        ListNode runner = head;
        while(runner.next != null) {
            runner = runner.next;
            if(runner.next != null) {
                runner = runner.next;
                walker = walker.next;
                if(walker == runner) {
                    break;
                }
            } else {
                break;
            }
        }
        if(runner.next == null) {
            return null;
        }
        runner = head;
        while(runner != walker) {
            runner = runner.next;
            walker = walker.next;
        }
        return walker;
    }
}