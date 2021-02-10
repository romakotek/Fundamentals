package com.company.Fundamentals.MainTask;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        //region Task#4
        Scanner scan = new Scanner(System.in);
        System.out.println("Type first number:");
        int b = scan.nextInt();
        System.out.println("Type second number:");
        int c = scan.nextInt();
        System.out.println("Type third number:");
        int d = scan.nextInt();
        System.out.println("The sum of these numbers is:");
        int sum = b + c + d;
        System.out.println(sum);
        System.out.println("The multiplication of these numbers is:");
        int multiplication = b * c * d;

        System.out.println(multiplication);
        //endregion
    }
}
