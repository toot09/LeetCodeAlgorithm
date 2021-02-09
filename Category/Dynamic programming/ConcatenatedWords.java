// 472. Concatenated Words
// Difficulty : Hard
// Comment : Oh my god... I have to review again and again and again...
// url : https://leetcode.com/problems/concatenated-words/
import java.util.*;
class ConcatenatedWords_category {
    public List<String> findAllConcatenatedWordsInADict(String[] words) {
        Set<String> dict = new HashSet<>();
        List<String> ret = new ArrayList<>();
        Arrays.sort(words, (a,b)->(a.length()-b.length()));
        for(String word : words) {
            if(helper(word, dict)) {
                ret.add(word);
            }
            dict.add(word);
        }
        return ret;
    }
    public boolean helper(String word, Set<String> dict) {
        if(dict.isEmpty()) return false;
        boolean[] chk = new boolean[word.length()+1];
        chk[0] = true;
        for(int j=1 ; j<=word.length() ; j++) {
            for(int i=0 ; i<j ; i++) {
                if(!chk[i]) continue;
                if(dict.contains(word.substring(i,j))) {
                    chk[j] = true;
                    break;
                }
            }
        }
        return chk[word.length()];
    }
}