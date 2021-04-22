// 247. Strobogrammatic Number II
// Difficulty : Medium
// Comment : I solve it on myown! It is not hard.
// url : https://leetcode.com/problems/strobogrammatic-number-ii/


import java.util.*;
class StrobogrammaticNumberII {
    private List<String> ret = new ArrayList<>();
    public List<String> findStrobogrammatic(int n) {
        char[] c1 = new char[]{'0','1','8'};
        char[][] c2 = new char[][]{{'0','0'}, {'1','1'}, {'6','9'}, {'8','8'}, {'9','6'}};
        helper((n-1)/2, n/2, c1, c2, new StringBuilder());
        return ret;
    }
    public void helper(int s, int e, char[] c1, char[][] c2, StringBuilder sb) {
        if(s<0) {
            if(sb.length()>0) ret.add(sb.toString());
            return;
        }
        if(s==e) {
            for(char c : c1) {
                sb.append(c);
                helper(s-1, e+1, c1, c2, sb);
                sb.deleteCharAt(0);
            }
        } else {
            for(char[] c : c2) {
                if(s==0 && c[1]=='0') continue;
                sb.append(c[0]);
                sb.insert(0,c[1]);
                helper(s-1, e+1, c1, c2, sb);
                sb.deleteCharAt(0);
                sb.deleteCharAt(sb.length()-1);
            }
        }
        return ;
    }
}
