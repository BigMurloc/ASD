package com.company.sorts;

import com.company.Data;
import java.util.LinkedHashMap;

public class HeapSort {
    private int counter;
    private Data heapSortData = new Data();

    public LinkedHashMap<String, Long> initHeapSort(){
        LinkedHashMap<String, Long> heapSortDurations = new LinkedHashMap<>();
        Long duration;

        //SMALL
        duration = calculateDuration(heapSortData.getSmallSortedNearly());
        heapSortDurations.put("Small Sorted", duration);
//        duration = calculateDuration(heapSortData.getSmallSortedHalf());
//        heapSortDurations.put("Small Half Sorted", duration);
//        duration = calculateDuration(heapSortData.getSmallSortedNot());
//        heapSortDurations.put("Small Not Sorted", duration);
//        duration = calculateDuration(heapSortData.getSmallSortedRandom());
//        heapSortDurations.put("Small Random Sorted", duration);
//        duration = calculateDuration(heapSortData.getSmallSortedRandomLowDuplicates());
//        heapSortDurations.put("Small Random Sorted Low Duplicates", duration);

        //MEDIUM
        duration = calculateDuration(heapSortData.getMediumSortedNearly());
        heapSortDurations.put("Medium Sorted", duration);
//        duration = calculateDuration(heapSortData.getMediumSortedHalf());
//        heapSortDurations.put("Medium Half Sorted", duration);
//        duration = calculateDuration(heapSortData.getMediumSortedNot());
//        heapSortDurations.put("Medium Not Sorted", duration);
//        duration = calculateDuration(heapSortData.getMediumSortedRandom());
//        heapSortDurations.put("Medium Random Sorted", duration);
//        duration = calculateDuration(heapSortData.getMediumSortedRandomLowDuplicates());
//        heapSortDurations.put("Medium Random Sorted Low Duplicates", duration);

        //LARGE
        duration = calculateDuration(heapSortData.getLargeSortedNearly());
        heapSortDurations.put("Large Sorted", duration);
//        duration = calculateDuration(heapSortData.getLargeSortedHalf());
//        heapSortDurations.put("Large Half Sorted", duration);
//        duration = calculateDuration(heapSortData.getLargeSortedNot());
//        heapSortDurations.put("Large Not Sorted", duration);
//        duration = calculateDuration(heapSortData.getLargeSortedRandom());
//        heapSortDurations.put("Large Random Sorted", duration);
//        duration = calculateDuration(heapSortData.getLargeSortedRandomLowDuplicates());
//        heapSortDurations.put("Large Random Sorted Low Duplicates", duration);

        return heapSortDurations;
    }
    private Long calculateDuration(int[] array) {
        Long before = System.nanoTime();
        sort(array);
        Long after = System.nanoTime();
        return (after - before)/1_000_000; // czas w ms
    }

    public void sort(int arr[])
    {
        int n = arr.length;

        // Build heap (rearrange array)
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(arr, n, i);

        // One by one extract an element from heap
        for (int i = n - 1; i > 0; i--) {
            // Move current root to end
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // call max heapify on the reduced heap
            heapify(arr, i, 0);
        }
    }

    // To heapify a subtree rooted with node i which is
    // an index in arr[]. n is size of heap
    void heapify(int arr[], int n, int i)
    {
        int largest = i; // Initialize largest as root
        int l = 2 * i + 1; // left = 2*i + 1
        int r = 2 * i + 2; // right = 2*i + 2

        // If left child is larger than root
        if (l < n && arr[l] > arr[largest])
            largest = l;

        // If right child is larger than largest so far
        if (r < n && arr[r] > arr[largest])
            largest = r;

        // If largest is not root
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            // Recursively heapify the affected sub-tree
            heapify(arr, n, largest);
        }
    }

    /* A utility function to print array of size n */
    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

//    public void heapSort(int[] array){
//        for(int i = 0; i < array.length - 1; i++) {
//            for (int j = array.length - 1; j >= 0; j--) {
//                counter = array.length - i;
//                heapifyUp(array, j);
//            }
//            swap(array, 0, counter - 1);
//        }
//    }
//
//    void heapifyUp(int[] tab, int index){
//        int largest = index;
//        int unsortedTabSize = counter;
//        int parent = getParent(tab, index);
//        if(hasLeftChild(unsortedTabSize, index) && getLeftChild(tab, index*2+1) > parent){
//            largest = index * 2 + 1;
//        }
//        if(hasRightChild(unsortedTabSize, index) && getRightChild(tab, index*2+2) > tab[largest]){
//            largest = index * 2 + 2;
//        }
//        if(largest != index){
//            swap(tab, largest, index);
//            heapifyUp(tab, largest);
//        }
//    }
//
//    boolean hasLeftChild(int size, int parentIndex){ // L: 2*parentIndex+1
//        int leftChildIndex = 2 * parentIndex + 1;
//        return leftChildIndex < size;
//    }
//
//    int getLeftChild(int[] tab, int childIndex) {
//        return tab[childIndex];
//    }
//
//    boolean hasRightChild(int size, int parentIndex){ //P: 2*parentIndex+2
//        int rightChildIndex = 2 * parentIndex + 2;
//        return rightChildIndex < size;
//    }
//
//    int getRightChild(int[] tab, int childIndex){
//        return tab[childIndex];
//    }
//
//    boolean hasParent(int index){
//        return index > 0;
//    }
//
//    int getParent(int[] tab, int parentIndex){
//        return tab[parentIndex];
//    }
//
//    void swap(int[] tab, int source, int destination){
//        int helper = tab[source];
//        tab[source] = tab[destination];
//        tab[destination] = helper;
//    }

}
