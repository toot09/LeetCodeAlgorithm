import java.util.*;
//Runtime: 362 ms (20.77%)
//Memory Usage: 44.2 MB
class ThreeSum_TIQ {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ret = new ArrayList<>();
        Map<Integer,List<Integer>> hm = new HashMap<>();
        Arrays.sort(nums);
        for(int i=0 ; i<nums.length-2 ; i++) {
            int num = nums[i];
            int s = i+1;
            int e = nums.length-1;
            while(s<e) {
                if(hm.containsKey(num)) {
                    boolean chk = false;
                    for(int n : hm.get(num)) {
                        if(n == nums[s]) {
                            chk = true;
                            break;
                        }
                    }
                    if(chk) {
                        s++;
                        continue;
                    }
                }
                if(num+nums[s]+nums[e]>0) {
                    e--;
                } else if(num+nums[s]+nums[e]<0) {
                    s++;
                } else {
                    List<Integer> input = new ArrayList<>();
                    input.add(num);
                    input.add(nums[s]);
                    input.add(nums[e]);
                    ret.add(input);
                    if(!hm.containsKey(num)) hm.put(num,new ArrayList());
                    hm.get(num).add(nums[s]);
                    s++;
                    continue;
                }
            }
        }
        return ret;
    }
}