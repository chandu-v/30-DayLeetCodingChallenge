package Week3;

import java.util.ArrayList;
import java.util.List;

public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        int [] arr = new int[]{0,0};
        int [] result = productExceptSelf(arr);
        for(int i : result){
            System.out.print(i+", ");
        }
    }
    public static int[] productExceptSelf(int[] nums) {
        int totalProduct = 1;
        int countOfZeros = 0;
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] == 0){
                countOfZeros++;
                continue;
            }
            totalProduct = totalProduct*nums[i];
        }

        List<Integer> result = new ArrayList<>();
        for(int i = 0 ; i < nums.length ; i++){
            
            if(nums[i]==0){
                result.add(0);
                continue;
            }
            result.add(totalProduct/nums[i]);
        }
        int []resultarr = new int[result.size()];
        if(result.contains(0)){
            if(countOfZeros>1){
                return resultarr;
            }
            for(int i = 0 ; i < resultarr.length ; i++){
                if(result.get(i)!=0){
                    resultarr[i] = 0;
                }else{
                    resultarr[i] = totalProduct;
                }
            }
        }else{
            for(int i = 0 ; i < resultarr.length ; i++){
                resultarr[i] = result.get(i);
            }
        }
        

        return resultarr;
    }
}