import java.util.*;

class Main {
  public static void main(String[] args) {
  
  
 /* Your MyLinkedList object will be instantiated and called as such:
 */
  MyLinkedList obj = new MyLinkedList();
  obj.addAtHead(1);
  obj.addAtTail(3);
  System.out.println(obj.get(0));
  System.out.println(obj.get(1));
  System.out.println("@@@@");
  
  obj.addAtIndex(1,2);
  System.out.println(obj.get(0));
  System.out.println(obj.get(1));
  System.out.println(obj.get(2));
  
  //obj.deleteAtIndex(1);
  //System.out.println(obj.get(1));
 

  }


}