package Week1;

import java.util.HashMap;
import java.util.Scanner;

public class MaximumSubArray {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(maxSubArray(arr));
        in.close();
    }

    public static int maxSubArray(int[] nums) {

        int max = Integer.MIN_VALUE;
        int result = max;
        HashMap<String, Integer> map = new HashMap<>();

        for (int i = nums.length - 1; i >= 0; i--) {
            for (int j = i; j >= 0; j--) {
                if(map.containsKey(j+","+i)){
                    return map.get(j+","+i);
                }else{
                    result = sumOfSubSet(nums, j, i);
                    map.put(j+","+i, result);
                }
                System.out.println(i + "\t" + j + "\t" + result);
                if (result > max) {
                    max = result;
                }
            }
        }
        return max;

    }

    public static int sumOfSubSet(int[] arr, int startIndex, int endIndex) {
        

        if (startIndex == endIndex) {
            return arr[startIndex];
        } else if (startIndex != arr.length - 1) {
            return arr[startIndex] + sumOfSubSet(arr, startIndex + 1, endIndex);
        } else {
            return arr[endIndex] + sumOfSubSet(arr, startIndex, endIndex );
        }

        // for (int i = startIndex; i <= endIndex; i++) {
        // sum += arr[i];
        // }
        // return sum;
    }
}