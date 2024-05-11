package com.java.program;

import java.util.regex.Pattern;

public class RemoveWhiteSpaces {

      public static void main(String[] args) {

            String s = "Hello how      are y o u b ro the   er    ";

            String s1 = Pattern.compile("\\s+").matcher(s).replaceAll("");
            String s2 = s.replaceAll(" ", "");
            System.out.println(s1);
            System.out.println(s2);
      }
}
