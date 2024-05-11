package com.java.program;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Solution {

      public static void main(String[] args) {

            List<Employee> employees = new ArrayList<>();

            employees.add(Employee.builder().impId("E4001").name("PRADEEP").age(36).position("H R").build());
            employees.add(Employee.builder().impId("E4002").name("ASHOK").age(28).position("MANAGER").build());
            employees.add(Employee.builder().impId("E4003").name("PRADEEP").age(28).position("MANAGER").build());
            employees.add(Employee.builder().impId("E4004").name("SANTOSH").age(25).position("MANAGER").build());
            employees.add(Employee.builder().impId("E4005").name("ASHOK").age(26).position("MANAGER").build());

            Map<String, Long> count = employees.stream().collect(Collectors.groupingBy(Employee::getName, Collectors.counting()));
            System.out.println(count);

      }

}
