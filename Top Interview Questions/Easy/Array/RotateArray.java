class RotateArray_TIQ {
    public void rotate(int[] nums, int k) {
        k %= nums.length;
        swap(0, nums.length-1, nums);
        swap(0, k-1, nums);
        swap(k, nums.length-1, nums);
    }
    public void swap(int s, int e, int[] nums) {
      while(s<e) {
          int tmp = nums[s];
          nums[s] = nums[e];
          nums[e] = tmp;
          s++;
          e--;
      }
  }
}