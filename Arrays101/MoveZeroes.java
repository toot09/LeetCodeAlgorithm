// for문 한번 사용 O(N)
class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int index = 0;
        for(int i=0 ; i<nums.length ; i++) {
            if(nums[i]!=0){
                nums[index++] = nums[i];
                if(index != i+1){
                    nums[i] = 0;
                }
            }
        }
    }
}


/** for문 두번사용 O(2N)
class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int index = 0;
        for(int i=0 ; i<nums.length ; i++) {
            if(nums[i]!=0){
                nums[index++] = nums[i];
            }
        }
        for(int j=index ; j<nums.length ; j++) {
            nums[j] = 0;
        }
    }
}
*/