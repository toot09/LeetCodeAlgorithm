//Runtime: 0 ms (100%)
//Memory Usage: 37.5 MB (95.53)
class SortColors_TIQ {
    public void sortColors(int[] nums) {
        int z = 0;
        int t = nums.length-1;
        for(int i=0 ; i<=t ; i++) {
            int num = nums[i];
            if(num==0) {
                nums[i] = 1;
                nums[z++] = 0;
            } else if(num==2) {
                nums[i--] = nums[t];
                nums[t--] = 2;
            }
        }
    }
}