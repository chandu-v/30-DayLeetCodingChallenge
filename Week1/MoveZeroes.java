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
        ArrayList<Integer> non_zeroes = new ArrayList<>();
        for(int j = 0 ; j < nums.length ; j++){
            if(nums[j] != 0){
                non_zeroes.add(nums[j]);
            }
        }
        for(int k : non_zeroes){
            System.out.println(k);
        }
        int i = 0 ;
        while(i!=non_zeroes.size()){
            nums[i] = non_zeroes.get(i);
            i++;
        }
        while(i<nums.length){
            nums[i] = 0;
            i++;
        }
        // while(i >=0){
        //     if(nums[i] == 0 &&  i<=nums.length-1){
        //         for(int j = i; j<nums.length-1 ; j++){
        //             if(nums[j+1] == 0){
        //                 break;
        //             }
        //             nums[j] = nums[j+1];
        //             nums[j+1] = 0;
        //             // rep++;
        //         }
        //     }
        //     // printArray(nums);
        //     i--;
        // }
        // System.out.println(rep);
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