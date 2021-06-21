// Difficulty : Medium
// Comment : Easy
// url : https://leetcode.com/problems/strobogrammatic-number-ii/


import java.util.*;
class StrobogrammaticNumberIIFacebook {
    public List<List<String>> groupAnagrams(String[] strs) {
        String[] sorted = new String[strs.length];
        Set<String> hs = new HashSet<>();
        List<List<String>> ret = new ArrayList<>();
        for(int i=0 ; i<strs.length ; i++) {
            char[] c = strs[i].toCharArray();
            Arrays.sort(c);
            sorted[i] = String.valueOf(c);
        }
        for(int i=0 ; i<strs.length ; i++) {
            if(hs.contains(sorted[i])) continue;
            hs.add(sorted[i]);
            List<String> list = new ArrayList<>();
            list.add(strs[i]);
            for(int j=i+1 ; j<strs.length ; j++) {
                if(sorted[i].equals(sorted[j])) list.add(strs[j]);
            }
            ret.add(list);
        }
        return ret;
    }
}