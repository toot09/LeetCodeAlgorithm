import java.util.*;
//Runtime: 1 ms (100%)
//Memory Usage: 38.9 MB
class ExcelSheetColumnNumber_TIQ {
    public int titleToNumber(String s) {
        int ret = 0;
        char[] c = s.toCharArray();
        for(int i=0 ; i<c.length ; i++) {
            ret += (int)Math.pow(26,i)*(c[c.length-1-i] - 'A' + 1);
        }
        
        return ret;
    }
}