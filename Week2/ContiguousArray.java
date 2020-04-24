package Week2;

public class ContiguousArray {

    public static void main(String[] args) {
        int [] arr = new int[]{0,0,1,0,0,0,1,1};
            int result = findMaxLength(arr);
        System.out.println(result);
    }

    private static int findMaxLength(int [] nums){
        int maxLength = 0;
        for(int i = 0 ; i< nums.length ; i++){
            for(int j = i+1; j<nums.length ; j++){
                if(maxLength>j-i){
                    break;
                }
                int []numberofNumbersArray = numberofNumbers(nums, i, j);
                if(numberofNumbersArray[0]==numberofNumbersArray[1]){
                    int len = numberofNumbersArray[0]*2;
                    if(len>maxLength){
                        maxLength = len;
                    }
                    
                }
            }
        }
        return maxLength;
    }

    private static int[] numberofNumbers(int []nums,int src, int dst){
        int count[] = new int[2];
        for(int j = src ; j <= dst ; j++){
            int i = nums[j];
            if(i==1){
                count[1] = count[1]+1;
            }else{
                count[0] = count[0]+1;
            }
        }
        return count;

    }
}