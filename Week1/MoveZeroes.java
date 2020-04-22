package Week1;

import java.util.*;
public class MoveZeroes {

    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        
        int [] nums = readArray();
        int [] result = MoveZeroes(nums);
        printArray(result);
    }

    private static int[] MoveZeroes(int[] nums) {
        // int rep = 0;
        int i = 0 ;
        for(int j = 0 ; j < nums.length ; j++){
            if(nums[j] != 0){
                nums[i] = nums[j];
                i++;
            }
        }
        
        while(i<nums.length){
            nums[i] = 0;
            i++;
        }
       
        return nums;
    }

    private static int[] readArray() {
        int N = in.nextInt();
        int [] arr = new int[N];
        for(int i = 0 ; i < N ; i++){
            arr[i] = in.nextInt();
        }
        return arr;
    }

    private static void printArray(int []nums){
        for(int i : nums){
            System.out.print(i+" ");
        }
        System.out.println();
    }
}