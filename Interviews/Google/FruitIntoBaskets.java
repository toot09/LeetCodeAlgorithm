// 904. Fruit Into Baskets
// Difficulty : Medium
// Comment : Squeeze Brain..
// url : https://leetcode.com/problems/fruit-into-baskets/

import java.util.*;
class FruitIntoBaskets {
    public int totalFruit(int[] tree) {
        Map<Integer, Integer> hm = new HashMap<>();
        int idx=0, len=0;
        for(int i=0 ; i<tree.length ; i++) {
            hm.put(tree[i],hm.getOrDefault(tree[i],0)+1);
            while(hm.size()>2 && idx<=i) {
                hm.put(tree[idx],hm.get(tree[idx])-1);
                hm.remove(tree[idx++],0);
            }
            len = Math.max(len, i-idx+1);
        }
        return len;
    }
}