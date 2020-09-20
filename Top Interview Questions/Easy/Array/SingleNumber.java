//Runtime: 0 ms (100%)
//Memory Usage: 40.8 MB (32.22%)
class SingleNumber_TIQ {
    public int singleNumber(int[] nums) {
        int ret = 0;
        for(int i=0 ; i<nums.length ; i++) {
            //Using XOR!
            ret ^= nums[i];
        }
        return ret;
    }
}

//Runtime: 3 ms (52.61%)
//Memory Usage: 40.7 MB (40.37%)
/*
class SingleNumber_TIQ {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int cnt = 1;
        for(int i=1; i<nums.length ; i++) {
            if(nums[i-1] != nums[i]) {
                if(cnt==1) return nums[i-1];
                cnt = 1;
            } else {
                cnt++;
            }
        }
        return nums[nums.length-1];
    }
}
*/