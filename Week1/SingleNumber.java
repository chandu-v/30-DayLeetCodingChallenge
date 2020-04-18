package Week1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class SingleNumber {
    public static void main(final String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(singleNumber(arr));
    }

    public static int singleNumber(final int[] nums) {
        // Using XOR Operator, if a number xor with itself the result will be zero. so the final solution will be our answer.
        // I got this solution from errichto's YouTube Channel.
        int result = 0;
        for (int i : nums) {
            result ^= i;

        }
        return result;
    }
}