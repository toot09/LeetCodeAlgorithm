class ThirdMaximumNumber {
    public int thirdMax(int[] nums) {
        double MIN = ((double) Integer.MIN_VALUE) - 1;
        double[] max = {MIN,MIN,MIN};
        for(int num : nums) {
            if(num > max[0]) {
                max[2] = max[1];
                max[1] = max[0];
                max[0] = num;
            } else if(num < max[0] && num > max[1]) {
                max[2] = max[1];
                max[1] = num;
            } else if(num < max[1] && num > max[2]) {
                max[2] = num;
            }
        }
        if(max[2]==MIN) {
            return (int)max[0];
        } else {
            return (int)max[2];
        }
    }
}

/*
class ThirdMaximumNumber{
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int idx = 1;
        for(int i=nums.length-1;i>0;i--) {
            if(nums[i]!=nums[i-1]) {
                if(++idx == 3) {
                    return nums[i-1];
                }
            }
        }
        return nums[nums.length-1];
    }
}
*/