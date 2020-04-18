package Week1;

import java.util.Scanner;

public class HappyNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(isHappy(n));
    }

    public static boolean isHappy(int n) {
        boolean result = false;
        int sum = 0;
        int digit = 0;
        while (sum != 1) {
            sum = 0;
            if(n == 0   ||  n   ==  1   ||  n   ==  2   ||  n   ==  3){
                if(n==1){
                    return true;
                }else{
                    return false;
                }
            }
            while (n != 0) {
                digit = n % 10;
                sum += digit * digit;
                n /= 10;
            }
            n = sum;
            
        }
        result = true;
        return result;
    }
}