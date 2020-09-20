import java.util.*;

class Main {
  
  public static void main(String[] args) {
    System.out.println("##### Start! #####");
    
    int[] nums = {0,1,0,3,12};
    //Output: [1,3,12,0,0]
    int idx = 0;
    for(int i=0 ; i<nums.length ; i++) {
        if(nums[i]!=0) {
            nums[idx] = nums[i];
            if(i!=idx++) {
                nums[i] = 0;
            }
        }
    }


    System.out.println("##### Compile Complete #####");
  }
  
} 

