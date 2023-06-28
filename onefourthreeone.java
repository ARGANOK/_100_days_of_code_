package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class onefourthreeone {
    public static void main(String[] args) {
     int[] arr = {4,2,1,1,2};
     int extra = 1;
        System.out.println(result(arr , extra));
    }
    static List<Boolean> result(int[] candies, int extraCandies){
        ArrayList<Boolean> arr1 = new ArrayList<>();
        int x = Max(candies);
        int n = candies.length;
        for (int i = 0; i < n; i++) {
            if(candies[i]+extraCandies>=x){
                arr1.add(i , true);
            }
            else if(candies[i]+extraCandies<x) {
                arr1.add(i , false);
            }
        }
        return arr1;
    }
    static int Max(int[] arr){
        int max = arr[0];
        int length = arr.length;
        for (int i = 0; i < length; i++) {
            if(arr[i] >max){
                max = arr[i];
            }
        }
        return max;
    }
}
