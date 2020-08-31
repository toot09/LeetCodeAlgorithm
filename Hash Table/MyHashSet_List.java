import java.util.*;

class MyHashSet_List {

    private int std = 15000;
    private List<Integer>[] list;


    /** Initialize your data structure here. */
    public MyHashSet_List() {
        list = new ArrayList[std];
    }
    
    public int findIdx(int key) {
        return key%std;
    }

    public void add(int key) {
        int idx = findIdx(key);
        if(list[idx] == null) {
          list[idx] = new ArrayList<Integer>();
        }
        if(list[idx].indexOf(key) == -1){
          list[idx].add(key);
        }
    }
    
    public void remove(int key) {
        int idx = findIdx(key);
        if((list[idx] != null)&&(list[idx].indexOf(key) != -1)) {
          list[idx].remove(list[idx].indexOf(key));
        }
    }
    
    /** Returns true if this set contains the specified element */
    public boolean contains(int key) {
        int idx = findIdx(key);
        return ((list[idx]==null)||(list[idx].indexOf(key)==-1))?false:true;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */