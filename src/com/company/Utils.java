package com.company;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

public class Utils {



    static void printArray(int[] array){
        System.out.print("[");
        for (int i = 0; i < array.length - 1; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println(array[array.length - 1] + "]");
    }

    static void initializeSortedArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        array[array.length - 1] = array.length/2;
    }

    static void initializeHalfSortedArray(int[] array){
        int halfNotSortedHelper = array.length/2;
        for (int i = 0; i < array.length; i++) {
            if(i < array.length/2){
                array[i] = i;
            }
            else{
                array[i] = i + halfNotSortedHelper;
                halfNotSortedHelper -= 2;
            }
        }
    }

    static void initializeNotSortedArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            array[i] = array.length - i - 1;
        }
    }

    static void initializeRandomSortedArrayWithDuplicates(int[] array){
        SecureRandom secureRandom = new SecureRandom();
        for (int i = 0; i < array.length; i++) {
            array[i] = secureRandom.nextInt(array.length/10);
        }
    }

    static void initializeRandomSortedArrayWithLowDuplicates(int[] array) {
        SecureRandom secureRandom = new SecureRandom();
        for (int i = 0; i < array.length; i++) {
            array[i] = secureRandom.nextInt(array.length*10);
        }
    }


}
