package me.bibilmeshka.tests;

import algorithms.Algorithms;

import java.util.ArrayList;

public class BinarySearchTest {
    public static void main(String[] args) {

        final var nums = new ArrayList<Integer>();
        for (int i = 0; i <= 100000000; i++) {
            nums.add(i);
        }

        final var binaryStartTime = System.currentTimeMillis();
        Algorithms.binarySearch(nums, 100000000);
        final var binaryEndTime = System.currentTimeMillis() - binaryStartTime;

        final var ordinaryStartTime = System.currentTimeMillis();
        for (int i = 0; i <= 100000000; i++) {
            if (i == 100000000) {
                break;
            }
        }
        final var ordinaryEndTime = System.currentTimeMillis() - ordinaryStartTime;

        System.out.println("Binary time: " + binaryEndTime);
        System.out.println("Ordinary time: " + ordinaryEndTime);
    }
}