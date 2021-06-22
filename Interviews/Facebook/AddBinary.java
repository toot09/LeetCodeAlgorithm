// Difficulty : Easy
// Comment : Easy
// url : https://leetcode.com/explore/interview/card/facebook/5/array-and-strings/263/

import java.util.*;
class AddBinaryFacebook {
    public String addBinary(String a, String b) {
        if(a.length()>b.length()) return helper(a, b, a.length()-b.length(), new StringBuilder());
        else return helper(b, a, b.length()-a.length(), new StringBuilder());
    }
    public String helper(String a, String b, int diff, StringBuilder sb) {
        boolean sign = false;
        for(int i=a.length()-1 ; i>=0 ; i--) {
            int i1 = a.charAt(i)-'0', i2 = 0;
            if(i-diff>=0) i2 = b.charAt(i-diff)-'0';
            int sum = i1+i2+(sign?1:0);
            if(sum>1) {
                sum%=2;
                sign = true;
            } else {
                sign = false;
            }
            sb.append(sum);
        }
        if(sign) sb.append(1);
        return sb.reverse().toString();
    }
}