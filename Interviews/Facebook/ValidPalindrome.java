//Difficulty : Easy
//Comment : Easy but have to remeber Character method such as Character.isDigit, Character.isLetter
// url : https://leetcode.com/problems/valid-palindrome/

import java.util.*;
class ValidPalindromeFacebook {
    public boolean isPalindrome(String s) {
        int i=0, j=s.length()-1;
        while(i<j) {
            while(i<j && !(Character.isLetter(s.charAt(i)) || Character.isDigit(s.charAt(i)))) i++;
            while(i<j && !(Character.isLetter(s.charAt(j)) || Character.isDigit(s.charAt(j)))) j--;
            if(Character.toLowerCase(s.charAt(i))!=Character.toLowerCase(s.charAt(j))) return false;
            i++;
            j--;
        }
        return true;
    }
}
