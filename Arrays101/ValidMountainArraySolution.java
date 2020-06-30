class Solution {
    public boolean validMountainArray(int[] A) {
        boolean up = true;
        int chg = 0;
        if(A.length < 3 || A[0]>=A[1]) {
          return false;
        }
        
        for(int i=1 ; i<A.length-1 ; i++) {
          
            if(A[i]==A[i+1]) {
                return false;
            }
            
            if(up){
                if(chkMinus(A[i+1]-A[i])) {
                  chg++;
                  up = false;
                }
            } else {
                if(!chkMinus(A[i+1]-A[i])) {
                  return false;
                }
            }
        }
        
        if(chg == 1) {
          return true;
        } else {
          return false;
        }
    }
    
    private static boolean chkMinus(int a) {
    if(a < 0) {
      return true;
    } else {
      return false;
    }
  }
}