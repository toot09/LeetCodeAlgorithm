// 349. Intersection of Two Arrays
// Difficulty : Easy
// Comment : easy
// url : https://leetcode.com/problems/intersection-of-two-arrays/
import java.util.*;
class IntersectionOfTwoArrays {
    public int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> list = new ArrayList<>();
        Set<Integer> hs = new HashSet<>();
        for(int n : nums1) hs.add(n);
        for(int n : nums2) {
            if(hs.contains(n)) {
                list.add(n);
                hs.remove(n);
            }
        }
        int[] ret = new int[list.size()];
        int idx=0;
        for(int n : list) {
            ret[idx++] = n;
        }
        return ret;
    }
}