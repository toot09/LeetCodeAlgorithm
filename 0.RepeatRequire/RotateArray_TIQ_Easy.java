/*
Input: nums = [1,2,3,4,5,6,7], k = 3
Output: [5,6,7,1,2,3,4]
Explanation:
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]
*/
// 순서를 바꾸는데 Swap을 사용해서 하면 쉽다.
// 문제 그대로 받아들이지 말고(진짜 rotate) 다른 방법을 생각해보자..
class RotateArray_TIQ_Easy {
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