package com.company.Fundamentals.MainTask;

import java.sql.SQLOutput;
import java.util.Scanner;

public class task2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        //region Task#2
        System.out.println("Define the length of your array, please:");
        int length = scan.nextInt();
        int[] array = new int[length];
        System.out.println("Now define the elements of your array:");
        for (int i=0; i<array.length; i++){
            array[i] = scan.nextInt();
        }
        System.out.println("Your array recursively looks like this:");
        for (int i = array.length - 1; i >= 0; i--){
            System.out.println(array[i]);
        }
        //endregion



    }
}
