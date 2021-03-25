// 482. License Key Formatting
// Difficulty : Ideation about "reverse"!
// Comment : Easy
// url : https://leetcode.com/problems/license-key-formatting/
import java.util.*;
class LicenseKeyFormatting {
    public String licenseKeyFormatting(String S, int K) {
        StringBuilder sb = new StringBuilder();
        S = S.toUpperCase();
        int cnt=0;
        for(int i=S.length()-1 ; i>=0 ; i--) {
            char c = S.charAt(i);
            if(c=='-') continue;
            sb.append(c);
            if(++cnt%K==0) sb.append('-');
        }
        if(sb.length()==0) return "";
        sb.reverse();
        if(sb.charAt(0)=='-') sb.deleteCharAt(0);
        return sb.toString();
    }
}