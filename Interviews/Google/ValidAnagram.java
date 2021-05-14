// Difficulty : Easy
// Comment : Easy
// url : https://leetcode.com/explore/interview/card/google/63/sorting-and-searching-4/3082/

import java.util.*;
class ValidAnagramGoogle {
    public boolean isAnagram(String s, String t) {
        char[] cs = s.toCharArray();
        Arrays.sort(cs);
        char[] ct = t.toCharArray();
        Arrays.sort(ct);
        s = String.valueOf(cs);
        t = String.valueOf(ct);
        return s.equals(t);
    }
}