package com.company.Fundamentals.MainTask;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //region Task#1
        System.out.println("Type your name, please:");
        String cmdName = scan.nextLine();
        System.out.println("Hello, " + cmdName + "!");
        //endregion
    }
}
