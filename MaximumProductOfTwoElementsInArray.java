package Leetcode;

public class MaximumProductOfTwoElementsInArray {
    public static void main(String[] args) {
        int[] arr = {3,4,3,5,2};
        System.out.println(maxProduct(arr));
    }
    public static int maxProduct(int[] nums) {
        boolean swapped;
        int ans = 0;
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
        ans = (nums[nums.length-1]-1)*(nums[nums.length-2]-1);
        return ans;
    }
}
