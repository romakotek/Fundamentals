package com.company.Fundamentals.OptionalTask1;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many integers would you like to enter?");
        int n = sc.nextInt();
        int [] array = new int[n];
        int digit;
        for (int i = 0; i < array.length; i++){
            array[i] = sc.nextInt();
        }
        for (int i = 0; i < array.length; i++){

        }
        System.out.println(digit);
//       int [] arr = fillArray();
//        System.out.println("------------" + "\n" + "You've added an array: ");
//        String digit = showArray(arr);
//        System.out.println(digit);



    }
    public static int [] fillArray (){
        Scanner scan = new Scanner(System.in);
        System.out.println("How many elements contains your array?");
        int n = scan.nextInt();
        int [] array = new int[n];
        for (int i=0; i<array.length;i++){
            System.out.println("Enter the element #" + (i+1) + ":");
            array[i] = scan.nextInt();
        }
        return array;
    }
    public static String showArray(int[]array){

        String str = null;
        System.out.print("[ ");
        for (int i=0; i < array.length; i++){
            str = Integer.toString(array[i]);
            System.out.print(str + " ");
        }
        System.out.println("]");
        return str;
    }


}
