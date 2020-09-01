class MyHashMap {

    Node[] nodes;

    /** Initialize your data structure here. */
    public MyHashMap() {
        nodes = new Node[15000];
    }
    
    /** value will always be non-negative. */
    public void put(int key, int value) {
        Node preNode = getPreNode(key);
        if(preNode.next == null) {
          preNode.next = new Node(key,value);
        } else {
          preNode.next.value = value;
        }
    }
    
    /** Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key */
    public int get(int key) {
        Node preNode = getPreNode(key);
        if(preNode.next == null) {
          return -1;
        } else {
          return preNode.next.value;
        }
    }
    
    /** Removes the mapping of the specified value key if this map contains a mapping for the key */
    public void remove(int key) {
        Node preNode = getPreNode(key);
        if(preNode.next != null) {
          preNode.next = preNode.next.next;
        } 
    }
    
    public Node getPreNode(int key) {
        int idx = getIdx(key);
        if(nodes[idx] == null) {
            nodes[idx] = new Node(-1,-1);
        }
        Node ret = nodes[idx];
        while(ret.next != null && ret.next.key != key) {
            ret = ret.next;
        }
        return ret;
    }

    public int getIdx(int key) {
      return Integer.hashCode(key)%nodes.length;
    }

    class Node {
      int key,value;
      Node next;
      Node(int key, int value) {
        this.key = key;
        this.value = value;
      }
    }

}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */