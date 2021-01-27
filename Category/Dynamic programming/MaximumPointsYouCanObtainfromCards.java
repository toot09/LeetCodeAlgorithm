// 1423. Maximum Points You Can Obtain from Cards
// Difficulty : Medium
// Comment : ?_?
// url : https://leetcode.com/problems/maximum-points-you-can-obtain-from-cards/
import java.util.*;
//Two Pointer(forward, backward)
class MaximumPointsYouCanObtainfromCards_category {
    public int maxScore(int[] cardPoints, int k) {
        int len = cardPoints.length;
        int[] dp = new int[len];
        for(int i=0 ; i<len && i<k ; i++) {
            dp[i] = (i-1<0?0:dp[i-1]) + cardPoints[i];  
        }
        if(cardPoints.length <= k) return dp[len-1];
        int ret = dp[k-1];
        for(int i=1 ; i<=k ; i++) {
            dp[len-i] = (i==1?0:dp[len-i+1]) + cardPoints[len-i];
            ret = Math.max(ret, dp[len-i] + (k-i<1?0:dp[k-i-1]));
        }
        return ret;
    }
}
/*
class MaximumPointsYouCanObtainfromCards_category {
    public int maxScore(int[] cardPoints, int k) {
        int len = cardPoints.length, ret=0;
        int[] dp = new int[len];
        for(int i=0 ; i<len ; i++) dp[i] = (i-1<0?0:dp[i-1]) + cardPoints[i];
        if(cardPoints.length<=k) return dp[dp.length-1];
        for(int i=k-1 ; i>=-1 ; i--) {
            ret = Math.max(ret, (i<0?0:dp[i])+dp[len-1]-dp[len-k+i]);
        }
        return ret;
    }
}
*/