package Leetcode;

import java.util.Arrays;

public class MaximumProductofThreeNumbers {
    public static void main(String[] args) {
        int[] arr = {-1,-2,-3};
        System.out.println(bubble(arr));
    }
    static int bubble(int[] nums){

        int ans = 0;
        boolean swapped;
        for(int i = 0;i < nums.length;i++){
            swapped = false;
            for (int j = 1; j<nums.length-i;j++){
                if(nums[j] < nums[j-1]){
                    int temp = nums[j];
                    nums[j] = nums[j-1];
                    nums[j-1] = temp;
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }
        int case1 = nums[0]*nums[1]*nums[nums.length-1];
        int case2 = nums[nums.length-1]*nums[nums.length-2]*nums[nums.length-3];

        int maxProduct = Integer.max(case1, case2);
        return maxProduct;
    }
}
