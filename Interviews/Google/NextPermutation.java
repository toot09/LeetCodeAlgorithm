// 31. Next Permutation
// Difficulty : Medium
// Comment : Wow. I had not known how to solve prob. of permutation
// url : https://leetcode.com/problems/next-permutation/


class NextPermutation {
    public void nextPermutation(int[] nums) {
        int p1 = nums.length-2, p2 = nums.length-1;
        while(p1>=0 && nums[p1]>=nums[p1+1]) p1--;
        if(p1>=0) {
            while(nums[p1]>=nums[p2]) p2--;
            swap(nums, p1, p2);
        }
        reverse(nums, p1+1);
    }
    public void swap(int[] nums, int p1, int p2) {
        int tmp = nums[p1];
        nums[p1] = nums[p2];
        nums[p2] = tmp;
    }
    public void reverse(int[] nums, int s) {
        int e=nums.length-1;
        while(s<e) swap(nums, s++, e--);
    }
}