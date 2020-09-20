import java.util.*;
//Runtime: 2 ms (98.69%)
//Memory Usage: 39.5 MB (78.76%)
class IntersectionOfTwoArraysII_TIQ {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> hm = new HashMap<>();
        List<Integer> ret = new ArrayList<>();
        for(int n : nums1) {
            hm.put(n,hm.getOrDefault(n,0)+1);
        }
        for(int n : nums2) {
            if(hm.containsKey(n) && hm.get(n)!=0) {
                ret.add(n);
                hm.put(n,hm.get(n)-1);
            }
        }
        int[] retArr = new int[ret.size()];
        for(int i=0 ; i<ret.size() ; i++) {
          retArr[i] = ret.get(i);
        }
        return retArr;
    }
}