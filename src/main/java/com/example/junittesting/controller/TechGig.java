package com.example.junittesting.controller;

import java.io.*;
import java.util.*;
public class TechGig {
    public static void main(String args[] ) throws Exception {

        //Scanner sc = new Scanner(System.in);
        //int testCases = sc.nextInt();
      //  for(int i=0;i<testCases;i++){

            //int numOfLottery = sc.nextInt();
            int[] arr = {25,49,11,15};


            int sum = 0;
            String finalNum="";
            for(int k=0;k<arr.length;k++){
                String s = String.valueOf(arr[k]);
                finalNum = finalNum + s.substring(s.length()-1);
            }
            sum = Integer.parseInt(finalNum);
            System.out.println("sum ="+sum);

            if(sum % 5 ==0){
                System.out.println("LUCKY");
            }else{
                System.out.println("UNLUCKY");
            }

       // }

    }
}

