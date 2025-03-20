package org.example;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       for (int i = n; i >=1; i--) {
           System.out.print(i);
           for (int j = i-1; j >= 1; j--) {
               System.out.print(j);
           }
           System.out.println();
           n--;
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