package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the size of the array");
        int number = scanner.nextInt();
        int [] values = myIntegerValues(number);
        System.out.println(Arrays.toString(values));
         reverseArray(values);
    }
    public static int[] myIntegerValues(int number){
        int[] arr = new int[number];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        return arr;
    }
    public static void reverseArray(int[] array){

        for (int i = array.length-1; i>=0 ; i--) {
            System.out.println(array[i]);
        }

    }
}
