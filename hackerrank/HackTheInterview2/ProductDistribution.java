package hackerrank.HackTheInterview2;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProductDistribution {

    public static void main(String[] args) {
        int[] arr = new int[] { 1, 2 };
        int m = 0;
        List<Integer> list = convertToList(arr);
        System.out.println(maxScore(list, m));
    }

    private static List<Integer> convertToList(int[] arr) {
        List<Integer> list = new ArrayList<>();
        for (int i : arr) {
            list.add(i);
        }
        return list;
    }

    public static int maxScore(List<Integer> a, int m) {
        // Write your code here
        BigInteger result = new BigInteger("0");
        int size = a.size();
        int product = 1;
        int start = 0;
        int end = start + m;
        Collections.sort(a);

        if (m == 0) {
            return 0;
        }

        BigInteger sum = new BigInteger("0");
        for (int i = 0; i < a.size(); i++) {

            sum = sum.add(new BigInteger("" + a.get(i)));
            start++;
            if (end == start) {
                end = start + m;
                end = size - m >= end ? start + m : a.size();
                result = result.add(sum.multiply(new BigInteger("" + product)));
                product++;
                sum = new BigInteger("0");
            }
        }

        int r = result.divideAndRemainder(new BigInteger("" + 1000000007))[1].intValue();
        return r;
    }
}