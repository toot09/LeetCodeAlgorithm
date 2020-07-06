class MyLinkedList {
    
    private Node head;
    private Node tail;
    private int size;
    
    /** Initialize your data structure here. */
    public MyLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }
    
    private class Node {
        int data;
        Node next;
        public Node(int val) {
            this.data = val;
            this.next = null;
        }
    }
    
    private Node find(int index) {
        Node tmp = head;
        for(int i=1 ; i<=index ; i++) {
            tmp = tmp.next;
        }
        return tmp;
    }
    
    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    public int get(int index) {
        if(index>=size) {
            return -1;
        }
        Node tmp = find(index);
        return tmp.data;
    }
    
    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
    public void addAtHead(int val) {
        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;
        if(size == 0) {
            tail = head;
        }
        size++;
    }
    
    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val) {
        Node newNode = new Node(val);
        tail.next = newNode;
        tail = newNode;
        if(size == 0) {
            head = tail;
        }
        size++;
    }
    
    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
    public void addAtIndex(int index, int val) {
        if(index == 0) {
            addAtHead(val);
        } else if(index == size) {
            addAtTail(val);
        } else {
            Node newNode = new Node(val);
            Node befNode = find(index-1);
            newNode.next = befNode.next;
            befNode.next = newNode;
            size++;
        }
    }
    
    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {
        if(index >= size) {
            return;
        }
        if(index == 0) {
            deleteAtHead();
        } else if(index == size-1) {
            deleteAtTail();
        } else {
            Node tmp = find(index-1);
            Node rmNode = find(index);
            tmp.next = tmp.next.next;
            rmNode = null;
            size--;
        }
    }
    
    public void deleteAtHead() {
        Node tmp = head;
        head = head.next;
        tmp = null;
        size--;
        if(size == 0) {
            tail = null;
        }
    }
    
    public void deleteAtTail() {
        Node tmp = find(size-2);
        Node befTail = tail;
        tail = tmp;
        befTail = null;
        size--;
    }
    
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */