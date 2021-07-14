// Difficulty : Medium
// Commnet : Great and Easy
// url : https://leetcode.com/problems/group-anagrams/

import java.util.*;
class GroupAnagramsFacebook {
    public List<List<String>> groupAnagrams(String[] strs) {
        // Input: strs = ["eat","tea","tan","ate","nat","bat"]
        // Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
        Map<String, List<String>> hm = new HashMap<>();
        for(String str : strs) {
            char[] c = str.toCharArray();
            Arrays.sort(c);
            String sorted = String.valueOf(c);
            if(!hm.containsKey(sorted)) hm.put(sorted, new ArrayList<String>());
            hm.get(sorted).add(str);
        }
        return new ArrayList(hm.values());
    }
}