import java.util.*;
// Use additional memory
class FindAllNumbersDisappearedinanArray {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int[] tmp = new int[nums.length];
        List<Integer> list = new ArrayList<Integer>();
        for(int i=0 ; i<nums.length ; i++) {
            tmp[nums[i]-1]++;
        }
        for(int i=0 ; i<tmp.length ; i++) {
            if(tmp[i] == 0) {
                list.add(i+1);
            }
        }
        return list;
    }
}