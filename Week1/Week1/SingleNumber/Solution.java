package Week1.Week1.SingleNumber;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

class Solution {
    public static void main(final String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = in.nextInt();
        }
        System.out.println(singleNumber(arr));
    }

    public static int singleNumber(final int[] nums) {
       int x = 0; 
       for(int i : nums){
           x ^= i;
       }
       return x;
    }

}