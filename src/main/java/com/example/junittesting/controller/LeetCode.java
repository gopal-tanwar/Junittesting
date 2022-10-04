package com.example.junittesting.controller;

import java.util.*;

public class LeetCode {
    public static void main(String[] args) {

        String s= "codeleet";
        int[] indices = {4,5,6,7,0,2,1,3};
        System.out.println(hammingWeight(00000000000000000000000000001011));
    }


    public static int hammingWeight(int n) {
        int count=0;
        for(int i=0;i<32;i++){
            int lsb = n & 1;
            if(lsb == 1){
                count++;
                n = n >> 1;
            }
        }
        return count;
    }
}