package com.amit;

public class Floor_of_an_array
{
    public static void main(String[] args) {


        int[] arr = new int[]{2, 4, 6, 7, 9, 11, 15, 16, 19, 23, 35, 36, 47};
        int target = 12;
        int ans = Floor(arr, target);
        System.out.println(ans);
    }


    static int Floor(int arr[], int target) {

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

        int min = target;
        for (int i=arr.length-1;i>=0;i--)
        {
            if(arr[i] < min)
            {
                return arr[i];
            }
        }

//            return arr[end];

        return -1;

    }
}


