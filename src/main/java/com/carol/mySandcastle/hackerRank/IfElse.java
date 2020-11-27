package com.carol.mySandcastle.hackerRank;

import java.util.Scanner;

public class IfElse {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int scannerInt = scanner.nextInt();
        scanner.close();

        if(scannerInt % 2 != 0 || (6 <= scannerInt && scannerInt <= 20)){
            System.out.println("Weird");
            return;
        }if( (2 <= scannerInt && scannerInt <= 5) || 20 <= scannerInt){
            System.out.println( "Not Weird");
        }
    }
}
