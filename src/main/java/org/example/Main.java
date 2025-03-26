package org.example;

import java.util.Arrays;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int m =1;
       for(int i = n; i > 0; i--) {
           for(int j =0; j<n-i; j++){
               System.out.print(" ");
           }
           for(int k =n; k-m>=0; k--){
               System.out.print(k-(m-1)+" ");
           }
           System.out.println();
           m++;
       }
    }
}
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int m =1;
//        for(int i = n; i>0; i--){
//            for(int j = 0; j<n-i; j++){
//                System.out.print(" ");
//            }
//            for(int k = n; k-m>=0; k--){
//                System.out.print(k-(m-1)+" ");
//            }
//            System.out.println();
//            m++;
//        }
//    }
//}


//    public static void main(String[] args) {
//    Solution s = new Solution();
//    int numlist[] = {4, 5, 6, 7, 8, 9, 10, 11, 12};
//    s.solution(3,numlist);
//    }
//}
//class Solution {
//    public int[] solution(int n, int[] numlist) {
//        int[] answer = {};
//        int a = 0;
//        for (int i = 0; i < numlist.length; i++) {
//            if(numlist[i]%n==0){
//                a = numlist[i];
//            }
//            for(int j=0;j<answer.length;j++){
//                answer[j] = a;
//            }
//        }
//        return answer;
//    }
//}
//
//




















