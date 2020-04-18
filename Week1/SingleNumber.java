package Week1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class SingleNumber {
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

    HashMap<Integer,Integer> map = new HashMap<>();
    
    // Adding each number to the map and if it is found again I'm removing so that the number that finally remains is our output.
    for(int i = 0 ; i < nums.length ; i++){
       if(map.containsKey(nums[i])){
            map.remove(nums[i]);
    }
    else{
        map.put(nums[i], 1);
    }
   }
   return (int) map.keySet().toArray()[0];
}
}