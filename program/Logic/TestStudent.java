package com.java.program.Logic;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TestStudent {

      public static void main(String[] args) {

            Student s1 = new Student("Tom", 1, 90, 15);
            Student s2 = new Student("Pester", 2, 80, 16);
            Student s3 = new Student("Lisa", 3, 75, 19);
            Student s4 = new Student("Robby", 4, 65, 13);
            Student s5 = new Student("Naveen", 5, 55, 18);

            List<Student> list = new ArrayList<>();

            list.add(s1);
            list.add(s2);
            list.add(s3);
            list.add(s4);
            list.add(s5);
            System.out.println("Total students: "+list.size());

//            for(Student s: list){
//
//                  System.out.println(s);
//            }

            list.stream().forEach(e-> System.out.println(e));

            list.stream().filter(e-> e.getMarks()>80).forEach(e-> System.out.println(e.getName()));

            //Integer integer = list.stream().map(e -> e.getMarks()).max(Comparable::compareTo).get();
            Integer integer = list.stream().map(e -> e.getMarks()).max(Integer::compare).get();
            System.out.println("highest Marks: "+integer);

            list.stream().filter(e->e.getMarks()==integer).forEach(e-> System.out.println(e.getName()+" got highest marks"));

      }
}
