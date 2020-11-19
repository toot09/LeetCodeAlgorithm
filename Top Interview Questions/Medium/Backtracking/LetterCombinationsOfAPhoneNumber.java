//Runtime: 1 ms (79.01%)
//Memory Usage: 39.4 MB
import java.util.*;

class LetterCombinationsOfAPhoneNumber_TIQ {
    public List<String> letterCombinations(String digits) {
        Map<Character, char[]> hm = new HashMap<>();
        hm.put('2', new char[]{'a', 'b', 'c'});
        hm.put('3', new char[]{'d', 'e', 'f'});
        hm.put('4', new char[]{'g', 'h', 'i'});
        hm.put('5', new char[]{'j', 'k', 'l'});
        hm.put('6', new char[]{'m', 'n', 'o'});
        hm.put('7', new char[]{'p', 'q', 'r', 's'});
        hm.put('8', new char[]{'t', 'u', 'v'});
        hm.put('9', new char[]{'w', 'x', 'y', 'z'});
        hm.put('0', new char[]{' '});

        Set<String> hs = new HashSet<>();
        Queue<String> q = new LinkedList<>();
        for(int i = 0; i < digits.length(); i++) {
            if(digits.charAt(i) == '1') {
                continue;
            }
            char[] arr = hm.get(digits.charAt(i));
            if(q.isEmpty()) {
                for(char c : arr) {
                    q.offer(String.valueOf(c));
                }
            } else {
                int size = q.size();
                for(int j = 0; j < size; j++) {
                    String s = q.poll();
                    for(char c : arr) {
                    if(!hs.contains(s + String.valueOf(c))) {
                        q.offer(s + String.valueOf(c));
                        hs.add(s + String.valueOf(c));
                    }
                }
                }
            }
        }
        List<String> ret = new ArrayList<>();
        while(!q.isEmpty()) {
            ret.add(q.poll());
        }
        return ret;
    }
}