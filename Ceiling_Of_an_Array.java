package com.amit;

public class Ceiling_of_an_array {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 4, 6, 7, 9, 11, 15, 16, 19, 23, 35, 36, 47};
        int target = 45;
        int ans = ceiling(arr, target);
        System.out.println(ans);
    }


    static int ceiling(int arr[], int target) {

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else if (target == arr[mid]) {
                return arr[mid];

            }
        }
//        int max = target;
//        for (int i=0;i<arr.length;i++)
//        {
//            if(arr[i] > max)
//            {
//                return arr[i];
//            }
//        }
        if (target>arr[arr.length-1])
        {
            return -1;
        }
        return arr[start];

    }
}
