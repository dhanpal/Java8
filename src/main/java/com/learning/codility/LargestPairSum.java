package com.learning.codility;

import java.util.Arrays;

public class LargestPairSum {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,9,10,5,6,7,8};
        System.out.println(largestPairSum(arr,arr.length));
    }

    private static int largestPairSum(int[] arr, int n) {
        int sum = 0;

        Arrays.sort(arr);
        sum = arr[arr.length-1] + arr[arr.length-2];

        return sum;
    }
}
