package hackerrank;

import java.util.ArrayList;
import java.util.List;

public class LongestSubArray {

    public static void main(String[] args) {
        int[] arr = new int[] { 3, 3, 2, 2 };
        // int[] arr = new int[] { 0,1,2,1,2,3 };
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }
        System.out.println(longestSubArray(list));

    }

    public static int longestSubArray(List<Integer> arr) {
        int result = 0;
        int rep = 0;
        if(arr.size() == 1){
            return 0;
        }
        for (int i = 0; i < arr.size() - 1; i++) {
            int k = arr.get(i);
            int l = arr.get(i + 1);
            int j = i + 2;
            rep = 0;
            if(k==l){
                rep = 1;
                while(k==l  &&  j<arr.size()){
                    l=arr.get(j);
                    rep++;
                    j++;
                }
            }
            if (Math.abs(k - l) == 1) {
                rep = rep == 0 ? 2 : rep+1;
                for (; j < arr.size(); j++) {
                    if (arr.get(j) == k || arr.get(j) == l) {
                        rep++;
                    } else {
                        break;
                    }
                }
                if (rep > result) {
                    result = rep;
                }
            }

        }
        return result;
    }
}