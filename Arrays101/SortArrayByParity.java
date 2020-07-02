class SortArrayByParity {
    public int[] sortArrayByParity(int[] A) {
        int even_index = 0;
        for(int i=0 ; i<A.length ; i++) {
            if(A[i]%2==0){
                int tmp = A[i];
                A[i] = A[even_index];
                A[even_index++] = tmp;
            }
        }
        return A;
    }
}