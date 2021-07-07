import java.util.*; 

class IntersectionOfTwoArraysFacebook {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> hs = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        for(int num : nums1) hs.add(num);
        for(int num : nums2) {
            if(hs.contains(num)) {
                list.add(num);
                hs.remove(num);
            }
        }
        int[] ret = new int[list.size()];
        for(int i=0 ; i<list.size() ; i++) {
            ret[i] = list.get(i);
        }
        return ret;
    }
}