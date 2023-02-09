package com.epam.mjc;

import java.util.*;
import java.util.stream.Collectors;

public class CollectionService {

    public List<Integer> filterEvenNumbers(List<Integer> list) {
        return list.stream()
                .filter(integer -> integer % 2 == 0)
                .collect(Collectors.toList());
    }

    //    public List<Integer> filterEvenNumbers(List<Integer> list) {
//        return list.stream()
//                .filter(integer -> integer % 2 == 0)
//                .collect(Collectors.toList());
//    }


    public List<String> toUpperCaseCollection(List<String> list) {
        return list.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
    }

    //    public List<String> toUpperCaseCollection(List<String> list) {
//        return list.stream()
//                .map(String::toUpperCase)
//                .collect(Collectors.toList());
//    }


    public Optional<Integer> findMax(List<Integer> list) {
        // https://www.baeldung.com/java-collection-min-max

        OptionalInt optionalInt = list
                .stream()
                // get an Integer Stream (OptionalInt)
                .mapToInt(v -> v)
                .max();

        int maxNumberInt = optionalInt.getAsInt();

        return Optional.of(maxNumberInt);
    }
//    public Optional<Integer> findMax(List<Integer> list) {
//        return list.stream()
//                .max(Comparator.naturalOrder()); //не думаю, что я тут правильно сделал, но тест проходит. Правда выводит еще Optional
//    }

//    public Integer findMax(List<Integer> list) {
//        return list.stream()
//                .max(Comparator.naturalOrder()).get(); //не думаю, что я тут правильно сделал, но тест проходит. Правда выводит еще Optional
//    }



//    public Optional<Integer> findMin(List<List<Integer>> list) {
//        // https://www.baeldung.com/java-difference-map-and-flatmap
//
//        Stream<Integer> steamInteger = list
//                .stream()
//                .flatMap(Collection::stream);
//
//        int minNumberInt = steamInteger
//                .mapToInt(v -> v)
//                .min()
//                .getAsInt();
//
//            return Optional.of(minNumberInt);
//}


    public Optional<Integer> findMin(List<List<Integer>> list) {
        return list.stream()
                .flatMap(x -> x.stream())
                .min(Comparator.naturalOrder()); //не думаю, что я тут правильно сделал, но тест проходит. Правда выводит еще Optional

    }

    public Integer sum(List<Integer> list) {
        return list.stream()
                .reduce(0, Integer::sum);
    }

//    public Integer sum(List<Integer> list) {
//        return list.stream()
//                .reduce(0, Integer::sum);
//    }
}
