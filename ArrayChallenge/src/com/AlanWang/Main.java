package com.AlanWang;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int[] myIntegers = getIntegers(5);
        printArray(myIntegers);

        printArray(sortIntegers(myIntegers));

        int[] sorted = sortIntegersTim(myIntegers);
        printArray(sorted);
    }

    public static int[] getIntegers(int capacity) {
        System.out.println("Enter " + capacity + " integer values. \r");
        int[] values = new int[capacity];

        for(int i = 0; i < values.length; i++){
            values[i] = scanner.nextInt();
        }

        return values;
    }

    public static void printArray(int[] array){
        for(int i = 0; i < array.length; i++){
            System.out.println("Element " + i + " is " + array[i]);
        }
    }

    public static int[] sortIntegers(int[] array){
        int max;
        int index;

        for (int i = 0; i < array.length; i++) {
            max = array[i];
            index = i;
            for (int j = i + 1; j < array.length; j++){
                if (array[j] > max) {
                    max = array[j];
                    index = j;
                }
            }
            array[index] = array[i];
            array[i] = max;
        }
        return array;
    }

    public static int[] sortIntegersTim(int[] array){
//        int[] sortedArray = new int[array.length];
//        for (int i = 1; i < array.length; i++){
//            sortedArray[i] = array[i];
//        }
        int[] sortedArray = Arrays.copyOf(array, array.length);

        boolean flag = true;
        int temp;

        while (flag){
            flag = false;
            for(int i = 1; i < sortedArray.length - 1; i++){
                if(sortedArray[i] < sortedArray[i+1]){
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = temp;
                    flag = true;
                }
            }
        }
        return sortedArray;
    }
}
