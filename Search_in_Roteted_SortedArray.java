package com.amit;
//here we are searching the target element in the rotated array
public class LeetCode_question_08
{
    public static void main(String[] args) {
        int [] arr = {4,5,6,7,0,1,2};
        int target = 2;
        int ans = search(arr,target);
        System.out.println(ans);
    }

    static int search(int[] arr,int target)
    {

        int pivot = findpivot(arr);

        if(pivot ==-1)
        {
            return binarysearch(arr,target,0,arr.length-1);
        }

        if(arr[pivot]==target)
        {
            return pivot;
        }

        if(target>=arr[0])
        {
            return binarysearch(arr,target,0,pivot-1);
        }
        else
        {
            return binarysearch(arr,target,pivot+1,arr.length-1);
        }

    }

    static int binarysearch(int[] arr, int target, int start, int end)
    {
        while(start<=end)
        {
            int mid=start+(end-start)/2;

            if(target==arr[mid])
            {
                return mid;
            }
            else if(arr[mid]>target)
            {
                end = mid-1;
            }
            else
            {
                start = mid+1;
            }

        }
        return -1;
    }

    static int findpivot(int[] arr)
    {
        int start = 0;
        int end = arr.length-1;

        while(start<=end) {
            int mid = start + (end - start) / 2;
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid - 1] > arr[mid]) {
                return mid - 1;
            }
            if (arr[start] > arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }


}
