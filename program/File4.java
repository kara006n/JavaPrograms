package com.java.program;

import java.io.*;

//reading content of file
public class File4 {
//this can be done using FileInputStream, BufferedReader, FileReader all will have same process just change
      //there name and it will work
      public static void main(String[] args) {

            String path = "C:\\Users\\Lenovo\\Downloads\\File\\neil.txt";
            FileInputStream in = null;
            try {
                  File file = new File(path);
                  //FileReader reader = new FileReader(file);
                  in = new FileInputStream(file);
                  System.out.println("Content of file is:");

                  int c =0;
                  while((c=in.read())!=-1){
                        System.out.print((char)c);
                  }
            }
            catch (Exception e){
                  e.printStackTrace();
            }

            finally {
                  try {
                        in.close();
                  } catch (IOException e) {
                        e.printStackTrace();
                  }
            }
      }
}
