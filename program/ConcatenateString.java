package com.java.program;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ConcatenateString {

      public static void main(String[] args) {

            String [] mall = {"Pallasio", "Sahara Ganj", "Phoenix", "Select City mall", "WaveMall"};
            String [] cinema = {"PVR", "Wave", "INOX"};

            Stream<String> malls = Arrays.stream(mall);
            Stream<String> cinemas = Arrays.stream(cinema);

            Stream<String> concat = Stream.concat(malls, cinemas);
//            Object[] objects = concat.map(x -> (String) x).toArray();
//            String [] collect = new String[objects.length];
//
//            int i =0;
//            for(Object o: objects){
//                  String o1 = (String) o;
//                  collect[i]=o1;
//                  i++;
//                  //System.out.println(o1);
//                  System.out.println(o);
//            }

            List<String> collect1 = concat.collect(Collectors.toList());
            System.out.println(collect1);

      }
}
