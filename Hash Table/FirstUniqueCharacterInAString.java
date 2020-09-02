import java.util.*;

//Runtime: 25 ms
//Memory Usage: 40.4 MB
class FirstUniqueCharacterInAString {
    public int firstUniqChar(String s) {
        Map<Character, Integer> hm = new HashMap<>();
        for(int i=0 ; i<s.length() ; i++) {
            hm.put(s.charAt(i),hm.getOrDefault(s.charAt(i),0)+1);
        }
        for(int i=0 ; i<s.length() ; i++) {
            if(hm.get(s.charAt(i))==1){
                return i;
            }
        }
        return -1;
    }
}

//Runtime: 31 ms
//Memory Usage: 51.9 MB
/*
class FirstUniqueCharacterInAString {
    public int firstUniqChar(String s) {
        Map<Character, Integer> hm = new HashMap<>();
        for(int i=0 ; i<s.length() ; i++) {
            hm.put(s.charAt(i),i);
        }
        for(int i=0 ; i<s.length() ; i++) {
            if(hm.containsKey(s.charAt(i))){
                if(hm.get(s.charAt(i))==i) {
                    return i;
                } else {
                    hm.remove(s.charAt(i));
                }
            }
        }
        return -1;
    }
}
*/