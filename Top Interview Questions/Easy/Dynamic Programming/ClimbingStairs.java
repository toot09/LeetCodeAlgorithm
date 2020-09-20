//Runtime: 0 ms (77.96%)
//Memory Usage: 36.1 MB
class ClimbingStairs {
    public int climbStairs(int n) {
        int[] cnt = new int[n+1];
        cnt[0] = 1;
        for(int i=1 ; i<=n ; i++) {
            if(i-1>=0) cnt[i] += cnt[i-1];
            if(i-2>=0) cnt[i] += cnt[i-2];
        }
        return cnt[n];
    }
}