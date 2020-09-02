import java.util.*;
class IntersectionOfTwoArraysII {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> hm = new HashMap<>();
        ArrayList<Integer> tmp = new ArrayList<>();
        for(int num1 : nums1) {
            hm.put(num1, hm.getOrDefault(num1,0)+1);
        }
        for(int num2 : nums2) {
            if(hm.containsKey(num2) && hm.get(num2)>0) {
                tmp.add(num2);
                hm.put(num2, hm.get(num2)-1);
            }
        }
        int[] ret = new int[tmp.size()];
        for(int i=0 ; i<tmp.size() ; i++) {
            ret[i] = tmp.get(i);
        }
        return ret;
    }
}