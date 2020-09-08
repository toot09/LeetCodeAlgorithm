import java.util.*;
// Hidden Excercise
/* 
Input : ["z","abc","bcd","ba","xyz","a","az","acef"]
Return :
[
  ["abc","bcd","xyz"],
  ["az","ba"],
  ["acef"],
  ["a","z"]
]
*/
class groupShiftedStrings {
  public List<List<String>> groupStrings(String[] strings) {
    Map<String, ArrayList<String>> hm = new HashMap<>();
    for(String str : strings) {
      char[] c = str.toCharArray();
      StringBuilder sb = new StringBuilder();
      for(int i=1 ; i<c.length ; i++) {
          int pre = c[i-1];
          int cur = c[i];
          // if next alphabet num is bigger than pre then plus 26. because End of alphatbet's num is 25. (for shift)
          if(cur - pre < 0) {
            cur+=26;
          }
          sb.append((char)(cur-pre+'a'));
      }
      String key;
      if(sb.length() == 0) {key = "A";}
      else {key = sb.toString();}
      if(!hm.containsKey(key)) {
          hm.put(key,new ArrayList<String>());
      }
      hm.get(key).add(str);
    }
    return new ArrayList(hm.values());
  }
}