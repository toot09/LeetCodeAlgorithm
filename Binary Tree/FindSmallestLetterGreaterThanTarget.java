// Difficulty : Easy
// Comment : easy..
// url : https://leetcode.com/explore/learn/card/binary-search/137/conclusion/977/
class FindSmallestLetterGreaterThanTarget {
    public char nextGreatestLetter(char[] letters, char target) {
        int s=0, e=letters.length-1;
        //["c", "f", "j"]
        while(s<e) {
            int mid = s+(e-s)/2;
            if(letters[mid]<=target) {
                s = mid+1;
            } else {
                e = mid;
            }
        }
        return target<letters[s]?letters[s]:letters[0];
    }
}