package com.amit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Given an array arr. Your task is
// to find the elements whose value is equal to that of its index value ( Consider 0-based indexing ).
public class Shubham_question_02 {
    public static void main(String[] args) {
        int[] arr = {15, 1, 45,3, 5};

        int[] a =search(arr);
        System.out.println(Arrays.toString(a));

    }

//    static void search(int[] arr) {
//        List<Integer> match = new ArrayList<>();
//
//        for (int i = 0; i <= arr.length - 1; i++) {
//
//
//            if (arr[i] == i) {
//                match.add(i);
//
//            }
//    else
//        {
//    match.add{-1}
//        }
//        System.out.println(match);

    static int[] search(int[] arr) {
        List<Integer> match = new ArrayList<>();

        for (int i = 0; i <= arr.length - 1; i++) {


            if (arr[i] == i) {
                match.add(i);
//                return new int[]{i};
            }
        }
        int[] result = new int[match.size()];
        for (int i = 0; i < match.size(); i++) {
            result[i] = match.get(i);
        }



        return new int[]{-1};

    }
}
