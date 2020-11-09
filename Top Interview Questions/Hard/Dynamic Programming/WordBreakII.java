import java.util.*;
//Runtime: 8 ms (61.83%)
//Memory Usage: 38.7 MB
class WordBreakII_TIQ {
    public List<String> WordBreakII(String s, List<String> wordDict) {
        return DFS(s, wordDict, new HashMap<String, List<String>>());
    }
    
    public List<String> DFS(String s, List<String> wordDict, HashMap<String, List<String>> hm) {
        List<String> ret = new ArrayList<>();
        if(s.length()==0) {
            ret.add("");
            return ret;
        }
        if(hm.containsKey(s)) return hm.get(s);
        for(String word : wordDict) {
            if(s.startsWith(word)) {
                List<String> left = DFS(s.substring(word.length()), wordDict, hm);
                for(String ls : left) {
                    ret.add(word + (ls==""?"":" ") + ls);
                }
            }
        }
        hm.put(s, ret);
        return ret;
    }
}