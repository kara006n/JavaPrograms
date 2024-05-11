package com.java.program;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.IntPredicate;
import java.util.stream.Collectors;

public class VowelCount {


      public static void vowel(String s){

            //if we don't want to collect values in list, map or set then we don't have to use mapToObj
            Map<Character, Long> collect = s.chars().mapToObj(x -> (char) x).filter(x -> x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u').collect(Collectors.groupingBy(x->x, Collectors.counting()));
            System.out.println("No of vowels are " +collect.size());
            System.out.println(collect);

      }

      public static void vowel2(String s){

            s.toLowerCase();
            int count=0;
            HashMap<Character, Integer> h = new HashMap<>();
            HashMap<Character, Integer> h2 = new HashMap<>();
            for(int i =0; i<s.length(); i++){

                  if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u'){
                        h.put(s.charAt(i), h.getOrDefault(s.charAt(i),0)+1);
                        count++;
                  }

                  else
                        h2.put(s.charAt(i), h.getOrDefault(s.charAt(i),0)+1);
            }
            //System.out.println(count);
            System.out.println("No of vowels in given string are "+h.size());
            System.out.println(h);
            System.out.println(h2);


      }

      public static <Char> void main(String[] args) {

            String s ="Hello how are you";
            System.out.println("given string is \""+s+"\"");
           // vowel(s);
           //vowel2(s);
//
//            IntPredicate predicate = new IntPredicate() {
//                  @Override
//                  public boolean test(int t) {
//                        return t=='a' || t=='e' || t=='i' || t=='0' || t=='u' || t=='A' || t=='E' || t=='I' || t=='O' || t=='U' ;
//                  }
//            };
//
//            s.chars().filter(predicate).count();
//

            System.out.println(s.chars().filter(ch->ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u').distinct().count());


            Map<Character, Long> collect = s.chars().mapToObj(x -> (char) x).filter(x -> x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u').collect(Collectors.groupingBy(x ->x, Collectors.counting()));



      }
}
