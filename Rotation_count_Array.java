package com.amit;

public class Rotation_count
{
    public static void main(String[] args) {
        int [] arr = {4,5,6,7,8,0,1,2};
        int ans = count(arr);
        System.out.println(ans);
    }

  static int count(int[] arr)
  {
      int pivot = findpivot(arr);
      if(pivot==-1)
      {
      return 0;
    }
      return pivot+1;
}

     static int findpivot(int[] arr)
     {
         int start = 0;
         int end=arr.length-1;

         while (start<=end)
         {
             int mid = start + (end-start )/2;
             if(mid<end && arr[mid]>arr[mid+1] )
             {
                 return mid;
             }
             if(mid>start && arr[mid-1]>arr[mid])
             {
                 return mid-1;
             }
             if(arr[start]>arr[mid])
             {
                 end = mid-1;
             }
             else {
                 start = mid+1;
             }
         }
         return -1;
     }
    }
