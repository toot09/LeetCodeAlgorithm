import java.util.*;
//Runtime: 6 ms (93.12%)
//Memory Usage: 41.6 MB (99.95%)
class GroupAnagrams_TIQ {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ret = new ArrayList<>();
        HashMap<String, List<String>> hm = new HashMap<>();
        for(String s : strs) {
            String tmp = stringSort(s);
            if(!hm.containsKey(tmp)) {
                hm.put(tmp, new ArrayList());
            }
            hm.get(tmp).add(s);
        }
        for(Map.Entry<String, List<String>> e : hm.entrySet()) {
            ret.add(e.getValue());
        }
        return ret;
    }
    public String stringSort(String s) {
        char[] c = s.toCharArray();
        Arrays.sort(c);
        return String.valueOf(c);
    }
}