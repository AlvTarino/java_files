package com.alvintaremwa;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myArray = getIntegers(10);
    }

    public static int[] getIntegers(int number){
        System.out.println("Enter " +number+ "values.\r");
        int[] values = new int[number];
        for(int i = 0; i<values.length; i++){
            values[i] = scanner.nextInt();
        }
        return values;
    }

    public static void printArray(int[] array){
        for (int i=0; i<array.length; i++){
            System.out.println("Element " +i+ "value is " +array);
        }
    }

    public static int[] sortIntegers(int[] someArray){

    }
}
