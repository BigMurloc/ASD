package com.company.sorts;

import com.company.Data;
import java.util.LinkedHashMap;

public class QuickSort {

    private Data quickSortData = new Data();

    public LinkedHashMap<String, Long> initQuickSort(){
        LinkedHashMap<String, Long> quickSortDurations = new LinkedHashMap<>();
        Long duration;

        //SMALL
//        duration = calculateDuration(quickSortData.getSmallSortedNearly());
//        quickSortDurations.put("Small Sorted", duration);
//        duration = calculateDuration(quickSortData.getSmallSortedHalf());
//        quickSortDurations.put("Small Half Sorted", duration);
//        duration = calculateDuration(quickSortData.getSmallSortedNot());
//        quickSortDurations.put("Small Not Sorted", duration);
        duration = calculateDuration(quickSortData.getSmallSortedRandom());
        quickSortDurations.put("Small Random Sorted", duration);
        duration = calculateDuration(quickSortData.getSmallSortedRandomLowDuplicates());
        quickSortDurations.put("Small Random Sorted Low Duplicates", duration);

        //MEDIUM
//        duration = calculateDuration(quickSortData.getMediumSortedNearly());
//        quickSortDurations.put("Medium Sorted", duration);
//        duration = calculateDuration(quickSortData.getMediumSortedHalf());
//        quickSortDurations.put("Medium Half Sorted", duration);
//        duration = calculateDuration(quickSortData.getMediumSortedNot());
//        quickSortDurations.put("Medium Not Sorted", duration);
        duration = calculateDuration(quickSortData.getMediumSortedRandom());
        quickSortDurations.put("Medium Random Sorted", duration);
        duration = calculateDuration(quickSortData.getMediumSortedRandomLowDuplicates());
        quickSortDurations.put("Medium Random Sorted Low Duplicates", duration);

        //LARGE
//        duration = calculateDuration(quickSortData.getLargeSortedNearly());
//        quickSortDurations.put("Large Sorted", duration);
//        duration = calculateDuration(quickSortData.getLargeSortedHalf());
//        quickSortDurations.put("Large Half Sorted", duration);
//        duration = calculateDuration(quickSortData.getLargeSortedNot());
//        quickSortDurations.put("Large Not Sorted", duration);
        duration = calculateDuration(quickSortData.getLargeSortedRandom());
        quickSortDurations.put("Large Random Sorted", duration);
        duration = calculateDuration(quickSortData.getLargeSortedRandomLowDuplicates());
        quickSortDurations.put("Large Random Sorted Low Duplicates", duration);

        return quickSortDurations;
    }

    public Long calculateDuration(int[] array) {
        Long before = System.nanoTime();
        quickSort(array, 0, array.length - 1);
        Long after = System.nanoTime();
        return (after - before)/1_000_000; // czas w ms
    }

    public void quickSort(int[] tab, int low, int high) {
        if (low < high) {
            int q = partition(tab, low, high);
            quickSort(tab, low, q); //
            quickSort(tab, q + 1, high); //
        }
    }
    private int partition(int[] tab, int low, int high){
        int pivot = tab[(low+high)/2];
        int smaller = low;
        for (int i = low; i < high ; i++) {
            if(tab[i] < pivot){
                swap(tab, smaller, i);
                smaller++;
            }
        }
        swap(tab, smaller, high);
        return smaller;
    }
    private void swap(int[] tab, int source, int destination){
        int helper = tab[source];
        tab[source] = tab[destination];
        tab[destination] = helper;
    }
}
