package Week3;

import java.util.Arrays;

public class PivotedArray {

    public static void main(String[] args) {
        int[] arr = new int[] { 4, 5, 6, 7, 0, 1, 2 };
        // int[] arr = new int[] { 1};
        int target = 3;
        int result = search(arr, target);
        System.out.println(result);
    }

    public static int search(int[] nums, int target) {
        int result = -2;
        // Arrays.sort(nums);
        int ptr1 = 0;
        int ptr2 = nums.length>1?1:0;
        if(ptr1<nums.length &&  nums[ptr1]==target){
            return ptr1;
        }
        //finding pivoted point
        while(ptr2<nums.length  &&   nums[ptr2]>nums[ptr1]){
            if(nums[ptr2]==target){
                result = ptr2;
            }
            ptr2++;
        }
        //check if pivoted pointed item's data is greated than the target
        if(ptr2 <   nums.length &&  nums[ptr2] == target){
            result = ptr2;
        }else{
            result = result==-2?binarySearch(nums, ptr2, nums.length, (ptr2+nums.length)/2, target):result;
        }
        
        return result;
    }

    public static int binarySearch(int[] nums, int start, int end, int mid, int target) {
        if (start < end) {
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                return binarySearch(nums, mid + 1, end, ((mid + 1 + end) / 2), target);
            } else if (nums[mid] > target) {
                return binarySearch(nums, start, mid, ((start + mid) / 2), target);
            }
        }
        return -1;
    }
}