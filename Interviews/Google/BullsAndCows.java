// Difficulty : Medium
// Commnet : There are many solutions.
// url : https://leetcode.com/problems/bulls-and-cows/

import java.util.*;
class BullsAndCows {
    public String getHint(String secret, String guess) {
        int[] cnt = new int[10];
        int A=0, B=0;
        for(int i=0 ; i<secret.length() ; i++) {
            char c1=secret.charAt(i), c2=guess.charAt(i);
            if(c1==c2) {
                A++;
                continue;
            }
            if(cnt[c1-'0']>0) B++;
            cnt[c1-'0']--;
            if(cnt[c2-'0']<0) B++;
            cnt[c2-'0']++;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(A);
        sb.append('A');
        sb.append(B);
        sb.append('B');
        return sb.toString();
    }
}