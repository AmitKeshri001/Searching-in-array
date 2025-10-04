package com.amit;

import java.util.Arrays;

public class LeetCode_question_03 {

    public static void main(String[] args) {

        int[] nums = new int[]{0,3, 4, 6};
        int target = 9;
        int[] ans = check(nums,target);
        System.out.println(Arrays.toString(ans));



    }

    static int[] check(int[] nums, int target)

    {

        for(int i=0;i<nums.length;i++)
        {


            for(int j=i+1;j<nums.length;j++)
            {
                int n = nums[i];
                int m = nums[j];
                if(n+m == target)
                {
                    return new int[]{i,j};
                }
            }



        }
        return new int []{-1,-1};
    }
}









