class Main {
  public static void main(String[] args) {
    
    int[] A = {-1,2,2};
    int len = A.length;
    int[] B = new int[len];
    
    for(int i=0;i<len;i++){
        int x = A[i]*A[i];
        if(i==0){
            B[0] = x;
        } else {
            for(int k=0;k<i;k++){
                if(x<B[k]) {
                    for(int j=len-2;j>=k;j--){
                        B[j+1] = B[j];
                    }
                    B[k] = x;
                    break;
                }else if(k==len-1) {
                  B[k] = x;
                }
            }
        }
    }
    for(int s=0;s<len;s++){
      System.out.println(B[s]);
    }
  }
}