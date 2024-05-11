package com.java.program;

import java.io.*;

public class FileCopy {

      //copy a file and create different file in same location
      public static void main(String[] args) {

            copy();

      }

      public static void copy(){

            File file = new File("C://Users//Lenovo//Downloads//Amit Kumar Ojha.pdf");
            File file1 = new File("C://Users//Lenovo//Downloads//AmitKOjha.pdf");
            FileInputStream fileInputStream = null;
            FileOutputStream fileOutputStream = null;
            try {
                  fileInputStream = new FileInputStream(file);
                  fileOutputStream = new FileOutputStream(file1);
            } catch (FileNotFoundException e) {
                  e.printStackTrace();
            }
            try {
                  System.out.println(fileInputStream.available());
            } catch (IOException e) {
                  e.printStackTrace();
            }
            int i = 0;

            try {
                  while ((i = fileInputStream.read() )!= -1){
                        fileOutputStream.write(i);
                  }
            } catch (IOException e) {
                  e.printStackTrace();
            }
            finally {
                  if (fileInputStream!=null){
                        try {
                              fileInputStream.close();
                        } catch (IOException e) {
                              e.printStackTrace();
                        }
                  }
                  if (fileOutputStream!=null){
                        try {
                              fileOutputStream.close();
                        } catch (IOException e) {
                              e.printStackTrace();
                        }
                  }
            }

      }
}
