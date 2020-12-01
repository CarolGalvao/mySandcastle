package com.carol.mySandcastle.hackerRank;

import java.util.Scanner;

public class LoopsII {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        for( int i = 0; i < q ; i ++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();
            for( int j = 0 ; j < n - 1 ; j ++){
                a += (int) ( Math.pow(2,j) * b);
                System.out.print(a + " ");
            }
            a += (int) ( Math.pow(2,n-1) * b);
            System.out.println(a);
        }
        sc.close();
    }


}
