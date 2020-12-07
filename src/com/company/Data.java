package com.company;

import java.security.NoSuchAlgorithmException;

public class Data {
    //test
    private int[] tinySortedNot = new int [10];
    //SMALL
    private int[] smallSortedNearly = new int[10_000];
    private int[] smallSortedHalf = new int[10_000];
    private int[] smallSortedNot = new int[10_000];
    private int[] smallSortedRandom = new int[10_000];
    private int[] smallSortedRandomLowDuplicates = new int[10_000];

    //MEDIUM
    private int[] mediumSortedNearly = new int[100_000];
    private int[] mediumSortedHalf = new int[100_000];
    private int[] mediumSortedNot = new int[100_000];
    private int[] mediumSortedRandom = new int[100_000];
    private int[] mediumSortedRandomLowDuplicates = new int[100_000];

    //LARGE
    private int[] largeSortedNearly = new int[1_000_000];
    private int[] largeSortedHalf = new int[1_000_000];
    private int[] largeSortedNot = new int[1_000_000];
    private int[] largeSortedRandom = new int[1_000_000];
    private int[] largeSortedRandomLowDuplicates = new int[1_000_000];



    public Data() {
        Utils.initializeRandomSortedArrayWithDuplicates(tinySortedNot);

        Utils.initializeSortedArray(smallSortedNearly);
        Utils.initializeHalfSortedArray(smallSortedHalf);
        Utils.initializeNotSortedArray(smallSortedNot);
        Utils.initializeRandomSortedArrayWithDuplicates(smallSortedRandom);
        Utils.initializeRandomSortedArrayWithLowDuplicates(smallSortedRandomLowDuplicates);


        Utils.initializeSortedArray(mediumSortedNearly);
        Utils.initializeHalfSortedArray(mediumSortedHalf);
        Utils.initializeNotSortedArray(mediumSortedNot);
        Utils.initializeRandomSortedArrayWithDuplicates(mediumSortedRandom);
        Utils.initializeRandomSortedArrayWithLowDuplicates(mediumSortedRandomLowDuplicates);

        Utils.initializeSortedArray(largeSortedNearly);
        Utils.initializeHalfSortedArray(largeSortedHalf);
        Utils.initializeNotSortedArray(largeSortedNot);
        Utils.initializeRandomSortedArrayWithDuplicates(largeSortedRandom);
        Utils.initializeRandomSortedArrayWithLowDuplicates(largeSortedRandomLowDuplicates);
    }

    public int[] getSmallSortedNearly() {
        return smallSortedNearly;
    }
    public int[] getSmallSortedHalf() {
        return smallSortedHalf;
    }
    public int[] getSmallSortedNot() {
        return smallSortedNot;
    }
    public int[] getSmallSortedRandom() {
        return smallSortedRandom;
    }
    public int[] getSmallSortedRandomLowDuplicates() {
        return smallSortedRandomLowDuplicates;
    }


    public int[] getMediumSortedNearly() {
        return mediumSortedNearly;
    }
    public int[] getMediumSortedHalf() {
        return mediumSortedHalf;
    }
    public int[] getMediumSortedNot() {
        return mediumSortedNot;
    }
    public int[] getMediumSortedRandom() {
        return mediumSortedRandom;
    }
    public int[] getMediumSortedRandomLowDuplicates() {
        return mediumSortedRandomLowDuplicates;
    }

    public int[] getLargeSortedNearly() {
        return largeSortedNearly;
    }
    public int[] getLargeSortedHalf() {
        return largeSortedHalf;
    }
    public int[] getLargeSortedNot() {
        return largeSortedNot;
    }
    public int[] getLargeSortedRandom() {
        return largeSortedRandom;
    }
    public int[] getLargeSortedRandomLowDuplicates() {
        return largeSortedRandomLowDuplicates;
    }

    public int[] getTinySortedNot() {
        return tinySortedNot;
    }






}
