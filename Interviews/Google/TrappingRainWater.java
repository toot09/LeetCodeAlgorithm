// 42. Trapping Rain Water
// Difficulty : Hard
// Comment : Great Prob. 10593 / 159. I couldn't remember how to solve it
// url : https://leetcode.com/problems/trapping-rain-water/



class TrappingRainWaterGoogle {
    public int trap(int[] height) {
        if(height.length==0) return 0;
        int s=0, e=height.length-1;
        int left=height[s], right=height[e], vol=0;
        while(s<=e) {
            if(left<right) {
                vol += Math.max(0,(left-height[s]));
                left = Math.max(left, height[s++]);
            } else {
                vol += Math.max(0,(right-height[e]));
                right = Math.max(right, height[e--]);
            }
        }
        return vol;
    }
}