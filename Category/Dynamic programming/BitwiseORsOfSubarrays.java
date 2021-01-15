//898. Bitwise ORs of Subarrays
// Difficulty : Medium
// Comment : Is it good problem??
// url : https://leetcode.com/problems/bitwise-ors-of-subarrays/
import java.util.*;
class BitwiseORsOfSubarrays_category {
    public int subarrayBitwiseORs(int[] arr) {
        Set<Integer> hs = new HashSet<>();
        Set<Integer> cur = new HashSet<>();
        for(int i : arr) {
            Set<Integer> tmp = new HashSet<>();
            for(int j : cur) tmp.add(i|j);
            tmp.add(i);
            cur = tmp;
            hs.addAll(cur);
        }
        return hs.size();
    }
}