package Week4;

public class BitWiseAnd {

    public static void main(String[] args) {
        int[] arr = new int []{2147483646,
            2147483647};
        int result = rangeBitwiseAnd(arr[0], arr[1]);
        System.out.println(result);
    }
    public static int rangeBitwiseAnd(int m, int n) {
        int result = m ; 
        for(int i = m+1 ; i <= n    &&  i>=m ; i++){
            System.out.println(result);
            if(result == 0 ){
                return 0;
            }
            result = result & i;
        }
        return result;
    }
}