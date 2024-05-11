package com.java.program;

public class ReverseString {

      public static void main(String[] args) {

            String s = "Neel Kamal";
            String rev="";
            for(int i = s.length()-1; i>=0; i--)
            {
                 //stem.out.println(rev);
                  rev = rev + s.charAt(i);
            }

            System.out.println(rev);
            StringBuffer s1 = new StringBuffer(s);
            System.out.println(s1.reverse());
      }
}
