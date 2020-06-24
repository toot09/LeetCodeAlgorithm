class Main {
  public static void main(String[] args) {
    
    int[] A = {-1,4,-4};
    int len = A.length;
    int[] B = new int[len];

    for(int i=0;i<len;i++){
        A[i] = A[i]*A[i];
    }

    for(int s=0;s<len;s++){
      System.out.println(A[s]);
    }
  }
}