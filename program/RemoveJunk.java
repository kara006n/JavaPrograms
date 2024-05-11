package com.java.program;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RemoveJunk {

      public static void main(String[] args) {

            String s  = "@@#%&^ Neel Kamal $&%$$&^$ 12^%";

//            Pattern p = Pattern.compile("\\."); //this is static  factory method which is static method of class and is responsible for generating object of that class
//            String[] s = p.split("www.durgasoft.com");
//            for(String s1: s)
//            {
//                  System.out.println(s1);
//            }
            System.out.println("Using String class Methods");
            String regEx = "[^a-zA-Z0-9]";
            String s1 = s.replaceAll(regEx, "");
            System.out.println(s1);

            System.out.println("Using Pattern class Methods");
            Pattern p = Pattern.compile("[^a-zA-Z0-9]");
            Matcher matcher = p.matcher(s);
            String s2 = matcher.replaceAll("");
            System.out.println(s2);


      }
}
