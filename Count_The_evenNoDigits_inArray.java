package com.amit;

import java.util.Arrays;
import java.util.Scanner;

public class LeetCode_question_01
{
    public static void main(String[] args) {
        System.out.println("you have to solve one leetcode question");

        Scanner input = new Scanner(System.in);
        System.out.println("enter the size of the array ");
        int size = input.nextInt();

        int[] arr= new int[size];

        System.out.println("enter the element of this array");

        for(int i=0;i<size;i++)
        {
            arr[i] = input.nextInt();
        }
        System.out.println("your array is");
        System.out.println(Arrays.toString(arr));
        System.out.println();
        System.out.println("your question is that you have to find the numbers of element having even number of digits");

        System.out.println();

        System.out.println("your array is ");
        System.out.println(Arrays.toString(arr));


        int ans =0;
        for (int i =0;i<size;i++)
        {
            int count = 0;
            int n  = arr[i];


            while(n>0)
            {
                n= n/10;
                count++;

            }


            if (count % 2 == 0)
            {
                ans ++;
            }

        }
        System.out.println("In the given array" +" "+ ans +" " + "numbers have even no of digits");

    }
}
