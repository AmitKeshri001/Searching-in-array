package com.amit;

public class Shubham_question_01 {
    public static void main(String[] args) {
        // Given an array of positive integers, return true if all elements are palindrome
        // otherwise, return false

        int[] arr = {121, 12321, 447, 666, 12321};
        if(ans(arr)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    static boolean ans(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            if(!isPalindrome(arr[i])) {
                return false; // If any number is not palindrome, return false
            }
        }
        return true; // All are palindrome
    }

    static boolean isPalindrome(int num) {
        int original = num;
        int reverse = 0;

        while(num != 0) {
            int remain = num % 10;
            reverse = reverse * 10 + remain;
            num = num / 10;
        }

        if(original==reverse)
        {
            return true;
        }
        return false;
    }
}
