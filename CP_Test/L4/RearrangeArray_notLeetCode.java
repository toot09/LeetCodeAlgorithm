/*
Given a binary array {0,1,1,0,0,1,0,0,1},
sort the array in a way that all zeros come to the left 
and all the one's come to the right side of the array.
*/
class RearrangeArray {
  public void rearrangeArray(int[] nums){
    int len = nums.length;
    int idx = 0;
    for(int i=0;i<len;i++) {
      if(nums[i]==0) {
        nums[idx++] = 0;
        if(idx == i+1) {
          nums[i] = 1;
        }
      }
    }
  }
}