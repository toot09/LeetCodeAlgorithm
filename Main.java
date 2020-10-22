import java.util.*;

class Main {
  public static void main(String[] args) {
    //System.out.println("##### Compile Complete #####");
    
    ListNode one1 = new ListNode(1);
    ListNode one2 = new ListNode(4);
    ListNode one3 = new ListNode(5);
    one1.next = one2;
    one2.next = one3;

    ListNode two1 = new ListNode(1);
    ListNode two2 = new ListNode(3);
    ListNode two3 = new ListNode(4);
    two1.next = two2;
    two2.next = two3;

    ListNode three1 = new ListNode(2);
    ListNode three2 = new ListNode(6);
    three1.next = three2;

    ListNode[] lists = {one1,two1,three1};

    //[[1,4,5],[1,3,4],[2,6]]

    ListNode head = new ListNode(0);
    ListNode ret = head;
    while(true) {
      int min = Integer.MAX_VALUE;
      int idx = 0;
      for(int i=0 ; i<lists.length ; i++) {
        if(lists[i] != null && lists[i].val <= min) {
          idx = i;
          min = lists[i].val;
        }
      }
      if(lists[idx] == null) break;
      head.next = lists[idx];
      head = head.next;
      lists[idx] = lists[idx].next;
      System.out.println(head.val);
    }
    
  }

  public static class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

} 

