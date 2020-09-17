class PowerOfThree {
    public boolean isPowerOfThree(int n) {
        if(n<3 && n!=1) return false;
        int num = (int)(Math.log(n)/Math.log(3));
        if((Math.pow(3,num)==n) || (Math.pow(3,num+1)==n)) {
            return true;
        }
        return false;
    }
}