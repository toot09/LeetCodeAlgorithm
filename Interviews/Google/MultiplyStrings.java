// 43. Multiply Strings
// Difficulty : Medium
// Comment : It is easy when you have a string basic knowledge
// url : https://leetcode.com/problems/multiply-strings/

import java.util.*;
class MultiplyStrings {
    public String multiply(String num1, String num2) {
        int[] num = new int[num1.length()+num2.length()];
        for(int i=num1.length()-1 ; i>=0 ; i--) {
            for(int j=num2.length()-1; j>=0 ; j--) {
                int p1 = i+j+1;
                int p2 = i+j;
                int mul = num[p1] + (num1.charAt(i)-'0')*(num2.charAt(j)-'0');
                num[p1] = mul%10;
                num[p2] += mul/10;
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int n : num) {
            if(!(sb.length()==0 && n==0)) sb.append(n);
        }
        return sb.length()==0?"0":sb.toString();
    }
}