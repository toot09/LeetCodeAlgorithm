//367. Valid Perfect Square
// Difficulty : Easy
// Comment : easy. Thought about it a little
// url : https://leetcode.com/problems/valid-perfect-square/

class ValidPerfectSquare {
    public boolean isPerfectSquare(int num) {
        if(num==1) return true;
        int s=1, e = num/2;
        while(s<=e) {
            int mid = s+(e-s)/2;
            if(mid != (mid*mid)/mid) e = mid-1;
            else if(mid*mid==num) return true;
            else if(mid*mid<num) s = mid+1;
            else e = mid-1;
        }
        return false;
    }
}