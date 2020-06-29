
class Main {
  public static void main(String[] args) {
  
 
      int[] nums = {1,1,2};

/*
        int index = 1;
        for(int i=1;i<nums.length-1;i++){
            if(nums[i-1] != nums[i]) {
                nums[index++] = nums[i];
            }
        }
  */    
    
    
    
        int index = 1;
        
        for (int i=0; i<nums.length-1; i++) {
            if (nums[i] != nums[i+1]) {
                nums[index] = nums[i+1];
                index++;
            }
        }
    
    

    for(int i : nums){
      System.out.println(i);
    }
    
  }

 

}