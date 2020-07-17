import java.util.*;
/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class FlattenAMultilevelDoublyLinkedList {
    public Node flatten(Node head) {
        Stack<Node> stack = new Stack<>();
        Node ret = head, next = null;
        while(head != null) {
            if(head.child != null) {
                if(head.next != null) {
                    next = head.next;
                    next.prev = null;
                    stack.push(next);
                }
                head.next = head.child;
                head.next.prev = head;
                head.child = null;
            }
            if(head.next == null && stack.size()>0) {
                next = stack.pop();
                head.next = next;
                next.prev = head;
            }
            head = head.next;
        }
        return ret;
    }


  class Node {
      public int val;
      public Node prev;
      public Node next;
      public Node child;
  }

}
