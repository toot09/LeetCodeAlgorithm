// 42. Trapping Rain Water
// Difficulty : hard
// Comment : Great Prob!!! I can't solve this on my own...
// url : https://leetcode.com/problems/trapping-rain-water/
import java.util.*;
class TrappingRainWater_category {
    public int trap(int[] height) {
        int l=0, r=height.length-1, ret=0;
        int leftMax=0, rightMax=0;
        while(l<=r) {
            leftMax = Math.max(leftMax, height[l]);
            rightMax = Math.max(rightMax, height[r]);
            if(leftMax<rightMax) {
                ret += (leftMax-height[l]);
                l++;
            } else {
                ret += (rightMax-height[r]);
                r--;
            }
        }
        return ret;
    }
}