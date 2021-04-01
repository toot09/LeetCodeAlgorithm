// 844. Backspace String Compare
// Difficulty : Easy
// Comment : Can solve it but Had many tries.
// url : https://leetcode.com/problems/backspace-string-compare/


class BackspaceStringCompare {
    public boolean backspaceCompare(String S, String T) {
        int si=S.length()-1, ti=T.length()-1;
        while(si>=0 || ti>=0) {
            int sCnt=0, tCnt=0;
            while(si>=0 &&(sCnt>0 || S.charAt(si)=='#')) {
                if(S.charAt(si)=='#') sCnt++;
                else sCnt--;
                si--;
            }
            while(ti>=0 &&(tCnt>0 || T.charAt(ti)=='#')) {
                if(T.charAt(ti)=='#') tCnt++;
                else tCnt--;
                ti--;
            }
            if(ti<0 || si<0) {
                if(ti>=0 || si>=0) return false;
                return true;
            }
            if(S.charAt(si--)!=T.charAt(ti--)) return false;
        }
        return true;
    }
}