package Week1;

import java.util.*;

public class Helper {
    public static int[] readArray() {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int [] arr = new int[N];
        for(int i = 0 ; i < N ; i++){
            arr[i] = in.nextInt();
        }
        return arr;
    }
    public static void printArray(int []nums){
        for(int i : nums){
            System.out.print(i+" ");
        }
        System.out.println();
    }
}