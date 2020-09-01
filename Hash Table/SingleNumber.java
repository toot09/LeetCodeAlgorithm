import java.util.*;

class SingleNumber {
    public int singleNumber(int[] nums) {

        //Use Bit Calculation
        //Runtime: 0 ms
        //Memory Usage: 40.6 MB
        
        int ret = 0;
        for(int num : nums) {
            ret ^= num;
        }
        return ret;
        

        //Use HashSet
        //Runtime: 5 ms
        //Memory Usage: 40.4 MB
        /*
        Set<Integer> hs = new HashSet<>();
        int totSum = 0;
        int setSum = 0;
        
        for(int num : nums) {
            if(hs.contains(num)) {
                setSum += num;
            }
            hs.add(num);
            totSum += num;
        }
        return totSum - 2*setSum;
        */
        

        //Use Array Sort (Without extra memory)
        //Runtime: 3 ms
        //Memory Usage: 40.7 MB
        /*
        Arrays.sort(nums);
        for(int i=0 ; i+1<nums.length ; i=i+2) {
            if(nums[i] != nums[i+1]) {
                return nums[i];
            }
        }
        return nums[nums.length-1];
        */
    }
}