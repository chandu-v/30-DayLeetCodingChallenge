package Week1;

import java.util.HashMap;
import java.util.Scanner;

public class MaximumSubArray {

    public static void main(String[] args) {


        int[] arr = new int[]{-2,1,-3,4,-1,2,1,-5,4};

        System.out.println(maxSubArray(arr));
    }

    public static int maxSubArray(int [] nums){
        int ans = Integer.MIN_VALUE, a = 0 ;
        for(int i : nums){
            a += i;
            ans = Math.max(a,ans);
            a = Math.max(a, 0);
        }
        return ans;
    }

    // public static int maxSubArray(int[] nums) {

    //     int max = Integer.MIN_VALUE;
    //     int result = max;
    //     HashMap<String, Integer> map = new HashMap<>();

    //     for (int i = nums.length - 1; i >= 0; i--) {
    //         for (int j = i; j >= 0; j--) {
    //             if(map.containsKey(j+","+i)){
    //                 return map.get(j+","+i);
    //             }else{
    //                 result = sumOfSubSet(nums, j, i);
    //                 map.put(j+","+i, result);
    //             }
    //             System.out.println(i + "\t" + j + "\t" + result);
    //             if (result > max) {
    //                 max = result;
    //             }
    //         }
    //     }
    //     return max;

    // }

    // public static int sumOfSubSet(int[] arr, int startIndex, int endIndex) {
        

    //     if (startIndex == endIndex) {
    //         return arr[startIndex];
    //     } else if (startIndex != arr.length - 1) {
    //         return arr[startIndex] + sumOfSubSet(arr, startIndex + 1, endIndex);
    //     } else {
    //         return arr[endIndex] + sumOfSubSet(arr, startIndex, endIndex );
    //     }

    //     // for (int i = startIndex; i <= endIndex; i++) {
    //     // sum += arr[i];
    //     // }
    //     // return sum;
    // }
}