package org.example;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or

import java.util.Arrays;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
     int[] arr =new int[11];

     for (int i = 0; i <arr.length; i++) {
         arr[i]=arr[i]+1+arr[i+2];
         arr[i+2] = arr[i] + arr[i+1];
         System.out.print(" "+arr[i]);
        }
    }
}

//Scanner sc = new Scanner(System.in);
//int a = sc.nextInt();
//int b = sc.nextInt();
//        for (int i = 0; i < b; i++) {
//        for (int j = 0; j < a-1; j++) {
//        System.out.print("*");
//            }
//                    System.out.println("*");
//        }