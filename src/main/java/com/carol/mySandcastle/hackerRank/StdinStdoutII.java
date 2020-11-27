package com.carol.mySandcastle.hackerRank;

import java.util.Scanner;

import static java.lang.Double.doubleToLongBits;
import static java.lang.Double.parseDouble;

public class StdinStdoutII {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int scannerInt = scanner.nextInt();
        double scannerDouble = scanner.nextDouble();
        scanner.nextLine();
        String scannerString = scanner.nextLine();

        scanner.close();

        System.out.println("String: " + scannerString);
        System.out.println("Double: " + scannerDouble);
        System.out.println("Int: " + scannerInt);

    }
}
