/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class CopyListwithRandomPointer {
    public Node copyRandomList(Node head) {
        Node newNode = new Node(0);
        Node ret = newNode;
        Node itHead = head;
        while(head != null){
            Node tmp = new Node(head.val);
            tmp.random = head.random;
            newNode.next = tmp;
            head = head.next;
            newNode = newNode.next;
        }
        
        Node itHeadTmp = itHead;
        Node itRet = ret.next;
        newNode = ret.next;
        while(newNode != null) {
            if(newNode.random != null) {
                while(itHead != newNode.random) {
                    itHead = itHead.next;
                    itRet = itRet.next;
                }
                newNode.random = itRet;
            }
            newNode = newNode.next;
            itHead = itHeadTmp;
            itRet = ret.next;
        }
        return ret.next;
    }


class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}


}