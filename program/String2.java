package com.java.program;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class String2 {

      public static boolean substring(String str, String sub){

            Pattern p = Pattern.compile(sub);
            Matcher matcher = p.matcher(str);
            if(matcher.find()){
                  System.out.println(matcher.group());
                  return true;
            }
            else
                  return false;

      }

      public static void main(String[] args) {

//use (.*)+Neel+(.*) if want to get whole string
            String s ="Hello Neel How are you";
            boolean neel = substring(s, "Neel");
            if(neel=true)
                  System.out.println("match found");
      }
}
