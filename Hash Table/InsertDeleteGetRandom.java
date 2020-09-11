import java.util.*;
//Runtime: 7 ms (100%)
//Memory Usage: 44.5 MB
class RandomizedSet {

    List<Integer> list;
    Map<Integer, Integer> hm;
    
    /** Initialize your data structure here. */
    public RandomizedSet() {
        list = new ArrayList<>();
        hm = new HashMap<>();
    }
    
    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
    public boolean insert(int val) {
        if(hm.containsKey(val)) {
            return false;
        }
        hm.put(val, list.size());
        list.add(val);
        return true;
    }
    
    /** Removes a value from the set. Returns true if the set contained the specified element. */
    public boolean remove(int val) {
        if(!hm.containsKey(val)) {
            return false;
        }
        int deleteIdx = hm.get(val);
        int lastIdx = list.size()-1;
        int lastVal = list.get(lastIdx);
        hm.put(lastVal,deleteIdx);
        hm.remove(val);
        list.set(deleteIdx, lastVal);
        list.remove(lastIdx);
        return true;
    }
    
    /** Get a random element from the set. */
    public int getRandom() {
        return list.get((int)(Math.random()*list.size()));
    }
    
}

//What a surprised result...
//HashMap,Set is the best method to find some data.
//Runtime: 229 ms (7.61%)
//Memory Usage: 43.3 MB
/*
class RandomizedSet {
    List<Integer> list;

    public RandomizedSet() {
        list = new ArrayList<>();
    }

    public boolean insert(int val) {
        if(list.indexOf(val) == -1) {
            list.add(val);
            return true;
        }
        return false;
        
    }

    public boolean remove(int val) {
        if(list.indexOf(val) == -1) {
            return false;
        }
        list.remove(list.indexOf(val));
        return true;
    }

    public int getRandom() {
        return list.get((int)(Math.random()*list.size()));
    }
    
}
*/