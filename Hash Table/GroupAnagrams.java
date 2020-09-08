import java.util.*;
//Runtime: 5 ms
//Memory Usage: 42.3 MB
class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> hm = new HashMap<>();
        for(String str : strs) {
            /**************sorting**************/
            char[] c = str.toCharArray();
            Arrays.sort(c);
            String key = String.valueOf(c);
            /***********************************/
            if(!hm.containsKey(key)) {
                hm.put(key, new ArrayList<String>());
            }
            hm.get(key).add(str);
        }
        return new ArrayList(hm.values());
    }
}

//Runtime: 33 ms
//Memory Usage: 43.9 MB
/* My Code
class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ret = new ArrayList<>();
        Map<String, List<String>> hm = new HashMap<>();
        List<String> keys = new ArrayList<>();
        
        for(String str : strs) {
            String[] arr = str.split("");
            Arrays.sort(arr);
            StringBuilder sb = new StringBuilder();
            for(String s : arr) {
                sb.append(s);
            }
            String hmKey = sb.toString();
            List<String> list;
            if(hm.containsKey(hmKey)) {
                list = hm.get(hmKey);
            } else {
                list = new ArrayList<>();
                keys.add(hmKey);
            }
            list.add(str);
            hm.put(hmKey,list);
        }
        
        for(String key : keys) {
            ret.add(hm.get(key));
        }
        
        return ret;
    }
}
*/