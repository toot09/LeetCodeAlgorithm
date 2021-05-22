// Difficulty : Easy
// Comment : Easy
// url : https://leetcode.com/problems/jewels-and-stones/


import java.util.*;
class JewelsAndStonesGoogle {
    public int numJewelsInStones(String jewels, String stones) {
        Set<Character> hs = new HashSet<>();
        int ret=0;
        for(int i=0 ; i<jewels.length() ; i++) hs.add(jewels.charAt(i));
        for(int i=0 ; i<stones.length() ; i++) {
            char c = stones.charAt(i);
            if(hs.contains(c)) ret+=1;
        }
        return ret;
    }
}