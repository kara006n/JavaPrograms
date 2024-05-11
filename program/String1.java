package com.java.program;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.IntStream;

//get count of words in given capitalized string
public class String1 {
//we can use Character.isUpperCase() to check
 //or using streams s.chars().filter(e-> e>=65 && e<=90).count();
 //or can use regular expression
/*Pattern p= Pattern.compile("[A-Z]");
            Matcher matcher = p.matcher(s);
            int count =0;
            while(matcher.find()){
                  count+=1;
            }
            System.out.println(count);
*/

      public static void main(String[] args) {

            String s = "HelloHowAreYou";
            int count =0;
            char[] chars = s.toCharArray();

            for(char ch:chars){
                  if(ch <=90 && ch >=65){
                        count++;
                  }
            }
            System.out.println("No of words in given string are: "+count);
      }
}
