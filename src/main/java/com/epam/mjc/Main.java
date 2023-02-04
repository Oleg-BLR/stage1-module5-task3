package com.epam.mjc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

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

        System.out.println(collectionService.findMax(initialIntList));
        System.out.println(collectionService.sum(initialIntList));
    }
}
