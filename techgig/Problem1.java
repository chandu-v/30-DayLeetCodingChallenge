package techgig;

import java.math.BigInteger;

/*
 * Enter your code here. Read input from STDIN. Print your output to STDOUT.
 * Your class should be named CandidateCode.
 */

import java.util.*;

class CandidateCode1 {
    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args){

        // Write code here
        int N = in.nextInt();
        BigInteger[] ingredients = readInputs(N);
        BigInteger[] availableIngredients = readInputs(N);
        BigInteger ppg = maxNumberOfPPG(ingredients, availableIngredients);
        System.out.println(ppg);
    }

    private static BigInteger maxNumberOfPPG(BigInteger[] ingredients, BigInteger[] availableIngredients) {
        BigInteger max = new BigInteger(""+Long.MAX_VALUE);
        BigInteger ppg = new BigInteger("0");
        if(ingredients.length == 0){
            return ppg;
        }
        for (int i = 0; i < ingredients.length; i++) {
            if(ingredients[i].equals(new BigInteger("0"))){
                continue;
            }
            ppg = availableIngredients[i].divide(ingredients[i]);
            if (ppg.compareTo(max) == -1) {
                max = ppg;
            }
            if (max.equals(0)) {
                return max;
            }
        }
        return max;
    }

    private static BigInteger[] readInputs(int n) {
        BigInteger[] arr = new BigInteger[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextBigInteger();
        }
        return arr;
    }

    private static void printArray(long[] arr) {
        for (long l : arr) {
            System.out.print(l);
        }
        System.out.println();
    }

}