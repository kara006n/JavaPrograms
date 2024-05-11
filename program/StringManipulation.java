package com.java.program;

import java.util.ArrayList;
import java.util.List;

public class StringManipulation {

     public static void main(String[] args) {

            String str = "The rains have started here";
           String str1 = "The rains Have started here";


           System.out.println(str.length());
            System.out.println(str.charAt(5));
            System.out.println(str.indexOf('s'));//1st occurrence of s
            System.out.println(str.indexOf('s',str.indexOf('s')+1));

           System.out.println(str.indexOf("have"));
           System.out.println(str.indexOf("hello"));

           //string comparison
           System.out.println(str.equals(str1));
           System.out.println(str.equalsIgnoreCase(str1));

           //substring
           System.out.println(str.substring(0,9));

           //trim
           String s = " Hello World ";
           System.out.println(s.trim());//remove only start and end spaces
           //System.out.println(s.replaceAll("'\\s",""));

           //replace
           System.out.println(s.replace(" ",""));
           String date = "01-01-2023";
           System.out.println(date.replace("-","/"));

           //split
           String test = "Hello_World_Dev_Spring";
           String[] split = test.split("_");
           for(String x: split){
                 System.out.println(x);
           }

           String s2 = "cares";
           System.out.println(s2.concat("you"));

           String x = "Hello";
           String y ="World";
           int a =100;
           int b = 200;

           System.out.println(x+y);
           System.out.println(a+b);
           System.out.println(x+y+a+b);
           System.out.println(a+b+x+y);
           System.out.println(x+y+(a+b));//string can be concatenated with any type

     }
}
