package com.company.sorts;

import com.company.Data;
import java.util.LinkedHashMap;

public class SelectSort {

    Data selectSortData = new Data();

    public LinkedHashMap<String, Long> initSelectSort(){
        LinkedHashMap<String, Long> selectSortDurations = new LinkedHashMap<>();
        Long duration;

        //SMALL
        duration = calculateDuration(selectSortData.getSmallSortedNearly());
        selectSortDurations.put("Small Sorted", duration);
//        duration = calculateDuration(selectSortData.getSmallSortedHalf());
//        selectSortDurations.put("Small Half Sorted", duration);
//        duration = calculateDuration(selectSortData.getSmallSortedNot());
//        selectSortDurations.put("Small Not Sorted", duration);
//        duration = calculateDuration(selectSortData.getSmallSortedRandom());
//        selectSortDurations.put("Small Random Sorted", duration);
//        duration = calculateDuration(selectSortData.getSmallSortedRandomLowDuplicates());
//        selectSortDurations.put("Small Random Sorted Low Duplicates", duration);

        //MEDIUM
        duration = calculateDuration(selectSortData.getMediumSortedNearly());
        selectSortDurations.put("Medium Sorted", duration);
//        duration = calculateDuration(selectSortData.getMediumSortedHalf());
//        selectSortDurations.put("Medium Half Sorted", duration);
//        duration = calculateDuration(selectSortData.getMediumSortedNot());
//        selectSortDurations.put("Medium Not Sorted", duration);
//        duration = calculateDuration(selectSortData.getMediumSortedRandom());
//        selectSortDurations.put("Medium Random Sorted", duration);
//        duration = calculateDuration(selectSortData.getMediumSortedRandomLowDuplicates());
//        selectSortDurations.put("Medium Random Sorted Low Duplicates", duration);

        //LARGE
        duration = calculateDuration(selectSortData.getLargeSortedNearly());
        selectSortDurations.put("Large Sorted", duration);
//        duration = calculateDuration(selectSortData.getLargeSortedHalf());
//        selectSortDurations.put("Large Half Sorted", duration);
//        duration = calculateDuration(selectSortData.getLargeSortedNot());
//        selectSortDurations.put("Large Not Sorted", duration);
//        duration = calculateDuration(selectSortData.getLargeSortedRandom());
//        selectSortDurations.put("Large Random Sorted", duration);
//        duration = calculateDuration(selectSortData.getLargeSortedRandomLowDuplicates());
//        selectSortDurations.put("Large Random Sorted Low Duplicates", duration);

        return selectSortDurations;
    }

    private Long calculateDuration(int[] array) {
        Long before = System.nanoTime();
        selectSort(array);
        Long after = System.nanoTime();
        return (after - before)/1_000_000; // czas w ms
    }

    public void selectSort(int[] array){
        int min_idx;
        for (int i = 0; i < array.length; i++) {
            min_idx = i;
            for (int j = i; j < array.length; j++) {
                if(array[j] < array[min_idx]){
                    min_idx = j;
                }
            }
            swap(array, i, min_idx);
        }
    }

    void swap(int[] tab, int source, int destination){
        int helper = tab[source];
        tab[source] = tab[destination];
        tab[destination] = helper;
    }

}
