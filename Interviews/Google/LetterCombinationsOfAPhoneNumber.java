// 17. Letter Combinations of a Phone Number
// Difficulty : Medium
// Comment : I solve it on myown! It is not hard.
// url : https://leetcode.com/problems/letter-combinations-of-a-phone-number/



import java.util.*;
class LetterCombinationsOfAPhoneNumber {
    private List<String> ret = new ArrayList<>();
    public List<String> letterCombinations(String digits) {
        Map<Character, char[]> hm = new HashMap<>();
        hm.put('2', new char[]{'a','b','c'});
        hm.put('3', new char[]{'d','e','f'});
        hm.put('4', new char[]{'g','h','i'});
        hm.put('5', new char[]{'j','k','l'});
        hm.put('6', new char[]{'m','n','o'});
        hm.put('7', new char[]{'p','q','r','s'});
        hm.put('8', new char[]{'t','u','v'});
        hm.put('9', new char[]{'w','x','y','z'});
        hm.put('0', new char[]{' '});
        helper(digits, 0, hm, new StringBuilder());
        return ret;
    }
    public void helper(String digits, int idx, Map<Character, char[]> hm, StringBuilder sb) {
        if(idx==digits.length()) {
            if(idx>0) ret.add(sb.toString());
            return;
        }
        for(char c : hm.get(digits.charAt(idx))) {
            sb.append(c);
            helper(digits, idx+1, hm, sb);
            sb.deleteCharAt(idx);
        }
        return;
    }
}
