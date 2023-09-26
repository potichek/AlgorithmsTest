package me.bibilmeshka.tests;

import algorithms.Algorithms;

import java.util.ArrayList;
import java.util.List;

public class QuickSortTest {
    public static void main(String[] args) {

        final var array = new ArrayList<Integer>();
        for (int i = 0; i <= 1000; i++) {
            array.add((int) (Math.random() * 1000));
        }

        final var ordinaryStartTime = System.currentTimeMillis();
        Algorithms.ordionarySort(array);
        final var ordinarySortEndTime = System.currentTimeMillis() - ordinaryStartTime;

        final var quickSortStartTime = System.currentTimeMillis();
        Algorithms.quickSortArray(array);
        final var quickSortEndTime = System.currentTimeMillis() - quickSortStartTime;

        System.out.println("Ordinary sort time: " + ordinarySortEndTime);
        System.out.println("Quick sort time: " + quickSortEndTime);
    }
}
