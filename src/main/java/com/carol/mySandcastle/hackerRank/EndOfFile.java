package com.carol.mySandcastle.hackerRank;

import java.util.Scanner;

public class EndOfFile {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = 1;
        while (in.hasNext()) {
            String text = in.nextLine();
            System.out.println(count + " " + text);
            count++;
        }
        in.close();
    }
}

