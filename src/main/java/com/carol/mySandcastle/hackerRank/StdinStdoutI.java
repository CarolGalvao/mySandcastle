package com.carol.mySandcastle.hackerRank;

import java.util.*;
import java.util.stream.*;

public class StdinStdoutI {

    public static void main(String[] args) {
      //  SpringApplication.run(MySandcastleApplication.class, args);

        Scanner scanner = new Scanner(System.in);
        int [] scannerInt = new int[3];
        for (int i = 0; i < 3; i++){
            scannerInt[i] = scanner.nextInt();
        }
        scanner.close();

        Arrays.stream(scannerInt).forEach(str -> System.out.print(str + "\n"));

    }
}
