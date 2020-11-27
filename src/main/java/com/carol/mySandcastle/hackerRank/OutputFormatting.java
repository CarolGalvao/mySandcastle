package com.carol.mySandcastle.hackerRank;

import java.util.Scanner;

public class OutputFormatting {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++){
            String s1=sc.next();
            int x=sc.nextInt();

            System.out.println(s1 + "           " + x);
            sc.nextLine();
        }
        System.out.println("================================");

    }

}
