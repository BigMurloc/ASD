package com.company;

import com.company.sorts.*;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.*;

import static com.company.Utils.*;

public class Main {

    public static void main(String[] args) throws NoSuchAlgorithmException {
        Long before = System.nanoTime();
//--------------------------------------------------------------------
        int[] testArray = new int []{9, 9, 8, 8, 7, 7, 5, 5, 3, 3, 2,2 ,0 ,0 ,1 ,1};

        InsertionSort insertionSort = new InsertionSort();
        BubbleSort bubbleSort = new BubbleSort();
        SelectSort selectSort = new SelectSort();
        QuickSort quickSort = new QuickSort();
        HeapSort heapSort = new HeapSort();
//
//        LinkedHashMap<String, Long> insertionSortDurations = insertionSort.initInsertionSort();
//        System.out.println("InsertionSort: ");
//        printDurations(insertionSortDurations);
//
//        LinkedHashMap<String, Long> bubbleSortDurations = bubbleSort.initBubbleSort();
//        System.out.println("BubbleSort: ");
//        printDurations(bubbleSortDurations);
//
//        LinkedHashMap<String, Long> selectSortDurations = selectSort.initSelectSort();
//        System.out.println("SelectSort: ");
//        printDurations(selectSortDurations);
//

        LinkedHashMap<String, Long> quickSortDurations = quickSort.initQuickSort();
        System.out.println("QuickSort: ");
        printDurations(quickSortDurations);
//
//        LinkedHashMap<String, Long> heapSortDurations = heapSort.initHeapSort();
//        System.out.println("HeapSort: ");
//        printDurations(heapSortDurations);


//--------------------------------------------------------------------
        Long after = System.nanoTime();
        Long programDuration = (after - before)/1000000000; // w sekundach
        System.out.println("Program wykonywal sie: "+programDuration+"s");
    }

    private static void printDurations(HashMap<String, Long> durations) {
        int counter = 0;
        for (Map.Entry<String, Long> entry: durations.entrySet()) {
            counter++;
            System.out.println(entry.getKey()+": "+entry.getValue()+"ms");
            if(counter%5==0)
                System.out.println();
        }
    }

    static void printArrays(List<int[]> arrays){
        for (int[] array:arrays) {
            printArray(array);
        }
    }

}
