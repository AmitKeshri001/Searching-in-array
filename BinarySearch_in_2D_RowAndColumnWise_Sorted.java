package com.amit;

import java.util.Arrays;

public class BinarySearch_inSorted_2D_Array_inRow_and_Col_wise
{
    public static void main(String[] args)
    {
        int[][] arr = {
                {10,20,30,40},{12,24,35,41},{29,34,38,45},{30,37,49,50}

        };
        int[] ans = search(arr,37);
        System.out.println(Arrays.toString(ans));

    }




    static int[] search(int[][] arr,int target)
    {
        int a =0;
        int b=arr.length-1;

        while (a<arr.length && b>=0)
        {
            if(arr[a][b] == target)
            {
                return new int[]{a,b};
            }
            if(arr[a][b] < target)
            {
                a++;
            }
            else
            {
                b--;
            }
        }
        return new int[]{-1,-1};
    }
}
