/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
 /*
  Brain Storming 한 결과가 처음으로 가장 효율적인 방법이었다
  뿌듯하지만 조금 이해가 안가는 부분이 있는데, size를 구하는 쪽에서
  가장 긴 node 길이 만큼만 돌릴려고 하니 size를 잘 가져오지 못한다
  왜 그럴까?
 */ 
public class IntersectionofTwoLinkedLists {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int sizeA = 0;
        int sizeB = 0;
        ListNode A = headA;
        ListNode B = headB;

        /* 왜 이렇게 하면 size를 잘 못가져올까?
        while(A!=null && B!=null) {
          if(A!=null){
              sizeA++;
              A = A.next;
          }
          if(B!=null){
              sizeB++;
              B = B.next;
          }
        }
        */

        while(A!=null){
            sizeA++;
            A = A.next;
        }
        while(B!=null){
            sizeB++;
            B = B.next;
        }
        A = headA;
        B = headB;
        if(sizeA >= sizeB) {
            for(int i=1 ; i<=sizeA-sizeB ; i++) {
                A = A.next;
            }
        } else {
            for(int i=1 ; i<=sizeB-sizeA ; i++) {
                B = B.next;
            }
        }
        while(A != null) {
            if(A == B) {
                break;
            } else {
                A = A.next;
                B = B.next;
            }
        }
        return A;
    } 
}