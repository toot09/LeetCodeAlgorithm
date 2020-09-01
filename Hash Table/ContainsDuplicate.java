import java.util.*;

class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> hs = new HashSet<>();
        for(int num : nums) {
            if(hs.contains(num)) {
                return true;
            }
            hs.add(num);
            
        }
        return false;
    }
}