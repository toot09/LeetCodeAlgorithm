//Runtime: 0 ms (100%)
//Memory Usage: 40.1 MB (71.24%)
class MissingNumber {
    public int missingNumber(int[] nums) {
        int sum = 0;
        int num = 0;
        for(int i = 0 ; i<nums.length ; i++) {
            sum += i+1;
            num += nums[i];
        }
        return sum-num;
    }
}