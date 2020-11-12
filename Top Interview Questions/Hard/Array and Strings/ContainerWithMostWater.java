//Runtime: 2 ms (95.06%)
//Memory Usage: 40.9 MB
// Two Pointer
class ContainerWithMostWater_TIQ {
    public int maxArea(int[] height) {
        int s=0, e=height.length-1, sum=0;
        while(s<e) {
            sum = Math.max(sum, (e-s)*Math.min(height[s],height[e]));
            if(height[s] <= height[e]) s++;
            else e--;
        }
        return sum;
    }
}

//Runtime: 663 ms (5.76%)
//Memory Usage: 40.6 MB
// Brutal Force
/*
class ContainerWithMostWater_TIQ {
    public int maxArea(int[] height) {
        int ret=0;
        for(int i=0 ; i<height.length-1 ; i++) {
            for(int j=i+1 ; j<height.length ; j++) {
                ret = Math.max( (j-i)*Math.min(height[i],height[j]), ret);
            }
        }
        return ret;
    }
}
*/