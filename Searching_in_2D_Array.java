package com.amit;

import java.util.Arrays;

public class BinarySearch_in_2D_Array
{
    public static void main(String[] args) {
        int[][] arr = {
                {1,4,6},{5,7,3},{2,2}

        };
        int target = 7;
        int[] a = search(arr,target);
        System.out.println(Arrays.toString(a));
    }

    static int[] search(int[][] arr, int target)
    {
        for(int row=0;row<arr.length;row++)
        {
            for(int col=0;col<arr[row].length;col++)
            {
                if(arr[row][col] == target)
                {
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1};
    }

}
