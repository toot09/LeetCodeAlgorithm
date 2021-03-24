// 11. Container With Most Water
// Difficulty : Medium
// Comment : I remember it!!!!
// url : https://leetcode.com/problems/container-with-most-water/



import java.util.*;
class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int s=0, e=height.length-1, ret=0;
        while(s<e) {
            ret = Math.max(ret, Math.min(height[s],height[e])*(e-s));
            if(height[s]<height[e]) s++;
            else e--;
        }
        return ret;
    }
}