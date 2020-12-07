package com.company.sorts;

import com.company.Data;
import java.util.LinkedHashMap;

public class BubbleSort {

    private Data bubbleSortData = new Data();

    public LinkedHashMap<String, Long> initBubbleSort(){
        LinkedHashMap<String, Long> bubbleSortDurations = new LinkedHashMap<>();
        Long duration;

        //SMALL
        duration = calculateDuration(bubbleSortData.getSmallSortedNearly());
        bubbleSortDurations.put("Small Sorted", duration);
//        duration = calculateDuration(bubbleSortData.getSmallSortedHalf());
//        bubbleSortDurations.put("Small Half Sorted", duration);
//        duration = calculateDuration(bubbleSortData.getSmallSortedNot());
//        bubbleSortDurations.put("Small Not Sorted", duration);
//        duration = calculateDuration(bubbleSortData.getSmallSortedRandom());
//        bubbleSortDurations.put("Small Random Sorted", duration);
//        duration = calculateDuration(bubbleSortData.getSmallSortedRandomLowDuplicates());
//        bubbleSortDurations.put("Small Random Sorted Low Duplicates", duration);

        //MEDIUM
        duration = calculateDuration(bubbleSortData.getMediumSortedNearly());
        bubbleSortDurations.put("Medium Sorted", duration);
//        duration = calculateDuration(bubbleSortData.getMediumSortedHalf());
//        bubbleSortDurations.put("Medium Half Sorted", duration);
//        duration = calculateDuration(bubbleSortData.getMediumSortedNot());
//        bubbleSortDurations.put("Medium Not Sorted", duration);
//        duration = calculateDuration(bubbleSortData.getMediumSortedRandom());
//        bubbleSortDurations.put("Medium Random Sorted", duration);
//        duration = calculateDuration(bubbleSortData.getMediumSortedRandomLowDuplicates());
//        bubbleSortDurations.put("Medium Random Sorted Low Duplicates", duration);
//
//        //LARGE
        duration = calculateDuration(bubbleSortData.getLargeSortedNearly());
        bubbleSortDurations.put("Large Sorted", duration);
//        duration = calculateDuration(bubbleSortData.getLargeSortedHalf());
//        bubbleSortDurations.put("Large Half Sorted", duration);
//        duration = calculateDuration(bubbleSortData.getLargeSortedNot());
//        bubbleSortDurations.put("Large Not Sorted", duration);
//        duration = calculateDuration(bubbleSortData.getLargeSortedRandom());
////        bubbleSortDurations.put("Large Random Sorted", duration);
////        duration = calculateDuration(bubbleSortData.getLargeSortedRandomLowDuplicates());
////        bubbleSortDurations.put("Large Random Sorted Low Duplicates", duration);

        return bubbleSortDurations;
    }

    private Long calculateDuration(int[] array) {
        Long before = System.nanoTime();
        bubbleSort(array);
        Long after = System.nanoTime();
        return (after - before)/1_000_000; // czas w ms
    }

    public void bubbleSort(int[] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if(array[j] > array[j+1]){
                    swap(array, j, j+1);
                }
            }
        }
    }

    private void swap(int[] tab, int source, int destination){
        int helper;
        helper = tab[source];
        tab[source] = tab[destination];
        tab[destination] = helper;
    }
    
}
