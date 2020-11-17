class FindTheDuplicateNumber_TIQ {
    public int findDuplicate(int[] nums) {
        int[] arr = new int[nums.length];
        for(int num : nums) {
            if(arr[num-1]>0) return num;
            arr[num-1] += 1;
        }
        return 0;
    }
}