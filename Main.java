
class Main {
  public static void main(String[] args) {
  
    int[] A = {};
    System.out.println(validMountainArray(A));
    
  }

  private static boolean validMountainArray(int[] A) {
       int start = 0;
       int end = A.length-1;
       for(int i=0;i<A.length-1;i++) {
         if(A[i]>=A[i+1]) break;
         start++;
       }
       for(int i=A.length-1;i>=1;i--) {
         if(A[i-1]<=A[i]) break;
         end--;
       }
       return (start==end)&&(end>0)&&(start<A.length-1);
  }
}