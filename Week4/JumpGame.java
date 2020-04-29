package Week4;

import java.util.*;
public class JumpGame {

    public static void main(String[] args) {
        int [] nums = new int[]{2,5,0,0};
        System.out.println(canJump(nums));
    }

    public static boolean canJump(int [] nums){
        if(nums.length==1){
            return true;
        }
        boolean result = false;
        int ptr1 = 0;
        while(ptr1 < nums.length-1){
            //This is maxJumpLength
           int maxJumpLength = ptr1+nums[ptr1];
           //Jump to the point where you either reach to the end of the array or to the heightest number in between.
           List<Integer>  list = new ArrayList<>();
           for(int i = ptr1; i <nums.length; i++){
            
           }
           ptr1 = ptr1+nums[ptr1];
        }
        if(ptr1 >= nums.length-1){
            result = true;
        }else{
            result = false;
        }
        return result;
    }
}