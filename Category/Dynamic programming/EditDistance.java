// 72. Edit Distance
// Difficulty : Hard
// Comment : Fucking hilarious problem!! Just great!!
// url : https://leetcode.com/problems/edit-distance/
import java.util.*;
class EditDistance_category {
    public int minDistance(String word1, String word2) {
        if(word1.length()==0||word2.length()==0) return word1.length()+word2.length();
        int l1 = word1.length(), l2=word2.length();
        int[][] dp = new int[l1+1][l2+1];
        
        for(int i=0 ; i<=l1 ; i++) dp[i][0] = i;
        for(int i=0 ; i<=l2 ; i++) dp[0][i] = i;
        
        for(int i=0 ; i<l1 ; i++) {
            for(int j=0 ; j<l2 ; j++) {
                if(word1.charAt(i)==word2.charAt(j)) {
                    dp[i+1][j+1] = dp[i][j];
                } else {
                    dp[i+1][j+1] = Math.min(dp[i][j], Math.min(dp[i+1][j], dp[i][j+1]))+1;
                }
            }
        }
        return dp[l1][l2];
    }
}