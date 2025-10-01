package com.amit;

public class Binary_Search_in_Ascending_or_Descending
{
    public static void main(String[] args) {

        int [] arr = {78,67,56,55,45,42,33,21,12,10,9,8,6,2,1};
        int target = 12;
        int start = 0;
        int end = arr.length-1;
        int ans = Check(arr,target,start,end);
        System.out.println(ans);
    }

    static int Check(int [] arr,int target,int start,int end)
    {
        int f=0;
        if(arr[start]>arr[end])
        {
            System.out.println("your array is in descending order");
            f=1;
        }
        else {
            System.out.println("your array is in ascending order");

        }

        if(f==1)
        {
            while(start<=end)
            {
                int mid = start + (end-start)/2;

                if(target>arr[mid])
                {
                    end = mid -1;
                }
                if(target<arr[mid])
                {
                    start = mid+1;
                }
                if(target==arr[mid])
                {
                    return mid;
                }
            }


        }
        if(f==0)
        {
            while(start<=end)
            {
                int mid = start + (end-start)/2;

                if(target>arr[mid])
                {
                    start = mid +1;
                }
                if(target<arr[mid])
                {
                    end = mid-1;
                }
                if(target==arr[mid])
                {
                    return mid;
                }
            }


        }
        return -1;
    }
}
