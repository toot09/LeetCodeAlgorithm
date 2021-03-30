// 215. Kth Largest Element in an Array
// Difficulty : Medium
// Comment : ??
// url : https://leetcode.com/problems/kth-largest-element-in-an-array/

import java.util.*;
class KthLargestElementInAnArray {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length-k];
    }
}