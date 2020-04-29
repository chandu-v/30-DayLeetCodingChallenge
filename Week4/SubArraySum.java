package Week4;

public class SubArraySum {

    public static void main(String[] args) {
        // [28,54,7,-70,22,65,-6]

        // int [] arr = new int[]{1,2,3};
        // int k = 3 ;
        int [] arr = new int[]{28,54,7,-70,22,65,-6};
        int k = 100 ;
        int result = subarraySum(arr, k);
        System.out.println(result);
    }
    public static int subarraySum(int[] nums, int k) {
        int count = 0 ;
        for(int i = 0 ; i < nums.length ; i++){
            for(int j = i ; j < nums.length ; j++){
                // System.out.println(String.format("%d, %d", i,j));
                if(isSumEqualToK(nums, i, j, k)){
                    // System.out.println(String.format("result Successed %d,%d", i,j));
                    count++;
                }
            }
        }
        return count;
    }

    public static boolean isSumEqualToK(int [] nums, int start , int end , int k){
        boolean result = false;
        int sum = 0;
        for(int i = start ; i <= end ; i++){
            sum+=nums[i];
        }
        if(sum == k){
            result = true;
        }
        System.out.println(String.format("%d, %d , %d",start, end, sum));
        return result;
    }
}