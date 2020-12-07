package com.company.sorts;

import com.company.Data;
import java.util.LinkedHashMap;

public class InsertionSort {

    private Data insertionSortData = new Data();

    public LinkedHashMap<String, Long> initInsertionSort(){
        LinkedHashMap<String, Long> insertionSortDurations = new LinkedHashMap<>();
        Long duration;

        //SMALL
        duration = calculateDuration(insertionSortData.getSmallSortedNearly());
        insertionSortDurations.put("Small Sorted", duration);
//        duration = calculateDuration(insertionSortData.getSmallSortedHalf());
//        insertionSortDurations.put("Small Half Sorted", duration);
//        duration = calculateDuration(insertionSortData.getSmallSortedNot());
//        insertionSortDurations.put("Small Not Sorted", duration);
//        duration = calculateDuration(insertionSortData.getSmallSortedRandom());
//        insertionSortDurations.put("Small Random Sorted", duration);
//        duration = calculateDuration(insertionSortData.getSmallSortedRandomLowDuplicates());
//        insertionSortDurations.put("Small Random Sorted Low Duplicates", duration);

        //MEDIUM
        duration = calculateDuration(insertionSortData.getMediumSortedNearly());
        insertionSortDurations.put("Medium Sorted", duration);
//        duration = calculateDuration(insertionSortData.getMediumSortedHalf());
//        insertionSortDurations.put("Medium Half Sorted", duration);
//        duration = calculateDuration(insertionSortData.getMediumSortedNot());
//        insertionSortDurations.put("Medium Not Sorted", duration);
//        duration = calculateDuration(insertionSortData.getMediumSortedRandom());
//        insertionSortDurations.put("Medium Random Sorted", duration);
//        duration = calculateDuration(insertionSortData.getMediumSortedRandomLowDuplicates());
//        insertionSortDurations.put("Medium Random Sorted Low Duplicates", duration);

        //LARGE
        duration = calculateDuration(insertionSortData.getLargeSortedNearly());
        insertionSortDurations.put("Large Sorted", duration);
//        duration = calculateDuration(insertionSortData.getLargeSortedHalf());
//        insertionSortDurations.put("Large Half Sorted", duration);
//        duration = calculateDuration(insertionSortData.getLargeSortedNot());
//        insertionSortDurations.put("Large Not Sorted", duration);
//        duration = calculateDuration(insertionSortData.getLargeSortedRandom());
//        insertionSortDurations.put("Large Random Sorted", duration);
//        duration = calculateDuration(insertionSortData.getLargeSortedRandomLowDuplicates());
//        insertionSortDurations.put("Large Random Sorted Low Duplicates", duration);

        return insertionSortDurations;
    }

    private Long calculateDuration(int[] array) {
        Long before = System.nanoTime();
        insertionSort(array);
        Long after = System.nanoTime();
        return (after - before)/1_000_000; // czas w ms
    }

    public void insertionSort(int[] array){
        int current;
        int j;
        for (int i = 1; i < array.length; i++) {
            current = array[i];
            j = i;
            while(j > 0 && current < array[j - 1]){
                array[j] = array[j - 1];
                j--;
            }
            array[j] = current;
        }
    }


}
