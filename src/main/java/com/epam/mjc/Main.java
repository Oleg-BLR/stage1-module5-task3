package com.epam.mjc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> initialIntList = new ArrayList<>(Arrays.asList(1, 3, 2, 8, 9));
        System.out.println(initialIntList);
        CollectionService collectionService = new CollectionService();
        List<Integer> filteredIntList = collectionService.filterEvenNumbers(initialIntList);
        System.out.println(filteredIntList);

        List<String> initialStringList = new ArrayList<>(Arrays.asList("one", "two", "three"));
        System.out.println(initialStringList);
        List<String> modifiedStringList = collectionService.toUpperCaseCollection(initialStringList);
        System.out.println(modifiedStringList);

        System.out.print(collectionService.findMax(initialIntList));
        System.out.println(" - ????? почему выводит еще и Optional");

        List<Integer> initialIntList01 = new ArrayList<>(Arrays.asList(1, 2, 8, 9));
        List<Integer> initialIntList02 = new ArrayList<>(Arrays.asList(1, 3, 2, 8));
        List<Integer> initialIntList03 = new ArrayList<>(Arrays.asList(2, 8, 9));
        List<List<Integer>> listOfLists = new ArrayList<>(Arrays.asList(initialIntList01, initialIntList02, initialIntList03));

        System.out.print(collectionService.findMin(listOfLists));
        System.out.println(" - ????? почему выводит еще и Optional");

        System.out.println(collectionService.sum(initialIntList));
    }
}
