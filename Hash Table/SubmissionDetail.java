import java.util.*;

class SubmissionDetail {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> hs = new HashSet<>();
        ArrayList<Integer> l = new ArrayList<>();
        for(int num : nums1) {
            hs.add(num);
        }
        for(int num : nums2) {
            if(hs.contains(num)) {
              hs.remove(num);
              l.add(num);
            }
        }

        int[] ret = new int[l.size()];
        for(int i=0 ; i < l.size() ; i++) {
          ret[i] = l.get(i);
        }
        return ret;
    }
}