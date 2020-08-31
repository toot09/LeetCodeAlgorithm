class MyHashSet_Node {

    private Node[] Nodes;

    /** Initialize your data structure here. */
    public MyHashSet_Node() {
        Nodes = new Node[15000];
    }
    
    public int findIndex(int key) {
        return key%(Nodes.length);
    }

    public Node getPreNode(int key) {
        int idx = findIndex(key);

        if(Nodes[idx] == null) {
          Nodes[idx] = new Node(-1,-1);
        }
        Node ret = Nodes[idx];

        while(ret.next != null && ret.next.key != key) {
          System.out.print(ret.key);
          ret = ret.next;
        }
        return ret;
    }

    public void add(int key) {
        Node preNode = getPreNode(key);

        if(preNode.next == null) {
            preNode.next = new Node(key,key);
        } else {
            preNode.next.key = key;
            preNode.next.value = key;

        }
      
    }
    
    public void remove(int key) {
        Node preNode = getPreNode(key);
        if(preNode.next != null) {
            preNode.next = preNode.next.next;
        }
    }
    
    /** Returns true if this set contains the specified element */
    public boolean contains(int key) {
        Node preNode = getPreNode(key);
        return (preNode.next==null)?false:true;
    }

    class Node {
      int key,value;
      Node next;
      public Node(int key, int value) {
        this.value = value;
        this.key = key;
        this.next = null;
      }
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */