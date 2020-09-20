//Runtime: 0 ms (100%)
//Memory Usage: 36.1 MB (85.13%)
class HammingDistance {
    public int hammingDistance(int x, int y) {
        //XOR
		int num = x^y;
        int ret = 0;
        while(num!=0) {
            ret++;
            num &= num-1;
        }
        return ret;
    }
}