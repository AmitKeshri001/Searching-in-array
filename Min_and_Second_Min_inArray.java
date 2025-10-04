package com.amit;

import java.util.Arrays;

public class Practice_question_2
{
    public static void main(String[] args) {
        int[] arr = {0,5,2,3,4,7,8,9};
        System.out.println(Arrays.toString(answer(arr)));
    }

    static int[] answer(int[] arr)
    {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++)
        {
            if(arr[i]<min)
            {
                min = arr[i];
            }

        }
        return second_min(arr,min);
    }

    static int[] second_min(int[] arr, int min) {
        int mini = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++)
        {
            if(arr[i]>min&&arr[i]<mini)
            {
                mini = arr[i];
            }

        }
        return new int[]{min,mini};
    }
}
