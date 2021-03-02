//350. Intersection of Two Arrays II
// Difficulty : Easy
// Comment : easy
// url : https://leetcode.com/problems/intersection-of-two-arrays-ii/
import java.util.*;
class IntersectionOfTwoArraysII_binarySearch {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> hm = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for(int n : nums1) {
            hm.put(n, hm.getOrDefault(n,0)+1);
        }
        for(int n : nums2) {
            if(hm.containsKey(n) && hm.get(n)>0) {
                list.add(n);
                hm.put(n, hm.get(n)-1);
            }
        }
        int[] ret = new int[list.size()];
        for(int i=0 ; i<list.size(); i++) {
            ret[i] = list.get(i);
        }
        return ret;
    }
}