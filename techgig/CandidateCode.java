package techgig;

import java.math.BigInteger;
import java.util.*;

public class CandidateCode {
    private static Scanner in = new Scanner(System.in);

    public static void main(String args[]) throws Exception {

        // Write code here
        int T = in.nextInt();
        for (int i = 0; i < T; i++) {
            int N = in.nextInt();
            BigInteger[] heroes = readInputs(N);
            BigInteger[] villans = readInputs(N);
            int maxNoOfFights = winningFights(heroes, villans);
            System.out.println(maxNoOfFights);
        }
    }

    private static int winningFights(BigInteger[] heroes, BigInteger[] villans) {
        int wins = 0;
        int count = 0;
        Arrays.sort(heroes);
        Arrays.sort(villans);
        // printArray(heroes);
        // printArray(villans);
        for (int i = 0; i < heroes.length   &&  count < heroes.length;count++) {

            if (heroes[count].compareTo(villans[i]) > 0) {
                wins++;
                i++;
            }

        }
        return wins;
    }

    private static BigInteger[] readInputs(int n) {
        BigInteger[] arr = new BigInteger[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextBigInteger();
        }
        return arr;
    }

    private static void printArray(BigInteger[] arr) {
        for (BigInteger l : arr) {
            System.out.print(l + "\t");
        }
        System.out.println();
    }

}