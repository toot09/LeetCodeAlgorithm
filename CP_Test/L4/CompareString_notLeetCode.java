/*
Given the two strings, check if you can make two strings same with only 1 remove, insert and replace operation.

input: pale, ple -> true
input: pales, pale -> true
input: pale, bale -> true
input: pale, bake -> false
*/
class CompareString {
  public boolean compareString(String a, String b) {
    int lenA = a.length();
    int lenB = b.length();
    boolean lenDiff = false;
    boolean ynDiff = false;
    if(Math.abs(lenA-lenB)>=1) {
      if(Math.abs(lenA-lenB)>1) {
        return false;
      }
      lenDiff = true;
    }
    while(!a.equals("") && !b.equals("")) {
      if(a.charAt(0) != b.charAt(0)) {
        if(lenDiff) {
          lenDiff = false;
          ynDiff = true;
          if(lenA>lenB) {
            a = a.substring(1);
          } else {
            b = b.substring(1);
          }
        } else {
          if(ynDiff) {
            return false;
          }
          ynDiff = true;
          a = a.substring(1);
          b = b.substring(1);
        }
      } else {
        a = a.substring(1);
        b = b.substring(1);
      }
    }
    return true;
  }
}