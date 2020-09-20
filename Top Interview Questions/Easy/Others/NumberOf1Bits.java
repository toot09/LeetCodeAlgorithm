public class NumberOf1Bits {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int ret = 0;
        while(n!=0) {
            ret++;
            //       n : 10000101100
            //     n-1 : 10000101011
            // n&(n-1) : 10000101000
            //                   X
            // n-1과 and를 하면 무조건 1한개가 빠지게 됨. 그렇게 해서 0 될 때까지 and하여 count!
            n &= (n-1);
        }
        return ret;
    }
}