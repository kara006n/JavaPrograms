package com.java.program;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicatesInArray2 {

      public static void main(String[] args) {

            String infra[] = {"Amazon","GCP","Azure","Amazon","Ali Baba","SauceLabs", "Azure","GCP","Azure"};
//            HashSet<String> hashSet = new HashSet<>();
//            Set<String> collect = Arrays.stream(infra).filter(x -> !hashSet.add(x)).collect(Collectors.toSet());
//            System.out.println(collect);


            Set<String> collect = Arrays.asList(infra)
                    .stream()
                    .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                    .entrySet()
                    .stream()
                    .filter(e -> e.getValue() > 1)
                    .map(Map.Entry::getKey)
                    .collect(Collectors.toSet());
            System.out.println(collect);
      }
}
