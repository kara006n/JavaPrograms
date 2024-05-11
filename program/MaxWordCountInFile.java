package com.java.program;

import java.io.*;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;

public class MaxWordCountInFile {

      public static void main(String[] args) {

            File f = new File("C:\\Users\\Lenovo\\Downloads\\File\\neil.txt");
            BufferedReader b = null;
            String line = "";
            Map<String, Integer> map = new HashMap<>();
            try {
                   b = new BufferedReader(new FileReader(f));
                   while((line=b.readLine())!=null){//we b.readLine will read whole string and then we will have to store
                         //all words in that line because next time new line will be read from file.
                         String[] words = line.toLowerCase().split(" ");
                         for(String s: words){
                               if(!s.isBlank()){// to remove blank spaces at the end of file
                                     map.put(s, map.getOrDefault(s,0)+1);
                               }

                         }
                   }

            } catch (FileNotFoundException e) {
                  e.printStackTrace();
            } catch (IOException e) {
                  e.printStackTrace();
            }

            System.out.println(map);

            System.out.println(Collections.max(map.values()));

            Set<Map.Entry<String, Integer>> entries = map.entrySet();
            for(Map.Entry e : entries){
                  System.out.println(e.getValue());
            }
            System.out.println(map.entrySet());

            map.entrySet().stream().filter(entry -> entry.getValue() == Collections.max(map.values())).forEach(e-> System.out.println(e.getKey()+" : "+e.getValue()));


      }
}
