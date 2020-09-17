//Runtime: 18 ms (24.49%)
//Memory Usage: 36 MB (81.82%)
//public class Solution extends VersionControl {
class VersionControl{
    public int firstBadVersion(int n) {
        int s=1, e=n;
        while(s<e) {
            int chk = s + (e-s)/2;
            if(isBadVersion(chk)) {
                e = chk;
            } else {
                s = chk+1;
            }
        }
        return s;
    }
    // Define API
    public boolean isBadVersion(int n) {
      return n>=5?true:false;
    }
}


/* Fail (Time Excess)
public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int s=1,e=n;    
        if(isBadVersion(n/2)) {
            e = n/2;
        } else {
            s = n/2;
        }
        for(int i=s ; i<=e ; i = i+2) {
            if(isBadVersion(i)) {
                if(i != 1 && isBadVersion(i-1)) {
                    return i-1;
                }
                return i;
            }
        }
        return e;
    }
}
*/