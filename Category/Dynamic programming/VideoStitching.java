//1024. Video Stitching
// Difficulty : Medium
// Comment : Squeeze brain!!!
// url : https://leetcode.com/problems/video-stitching/
import java.util.*;
class VideoStitching_category {
    public int videoStitching(int[][] clips, int T) {
        int s=0, e=0, ret=0;
        while(e<T) {
            for(int i=0 ; i<clips.length ; i++) {
                if(clips[i][0]<=s) {
                    e = Math.max(e, clips[i][1]);
                }
            }
            if(s==e) return -1;
            s = e;
            ret++;
        }
        return ret;
    }
}

/*
// inefficient code
class Solution {
    public int videoStitching(int[][] clips, int T) {
        if(T==0) return 0;
        Arrays.sort(clips, (a,b)->(a[0]-b[0]));
        int[] dp = new int[T+1];
        Arrays.fill(dp, T+1);
        for(int i=0 ; i<clips.length ; i++) {
            int s=clips[i][0], e=clips[i][1]>T?T:clips[i][1], cnt=T+1;
            while(s<=e) {
                cnt = Math.min(cnt, dp[s]+1);
                if(clips[i][0]==0) {
                    dp[s] = 1;
                } else if(dp[s]>T) {
                    dp[s] = Math.min(dp[s], cnt);
                }
                s++;
            }
        }
        return dp[T]>T?-1:dp[T];
    }
}
*/