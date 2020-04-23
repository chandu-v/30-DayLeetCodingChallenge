package Week1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountingElements {

    public static void main(String[] args) {
        int[] arr = new int[] { 1, 1, 2, 2 };
        int result = countElements(arr);
        System.out.println(result);
    }

    public static int countElements(int[] arr) {
        int result = 0;
        List<Integer> list = new ArrayList<>();
        List<Integer> resultList = new ArrayList<>();

        for (int i : arr) {
            list.add(i);
            
        }
        for (int i : arr) {
            if (list.contains(i + 1)) {
                resultList.add(i);
                result++;
            }
        }
        return result;
    }
}