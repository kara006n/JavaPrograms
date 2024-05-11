package com.java.program;

import java.io.File;
//list all files and folder in directory
public class Files2 {

      public static void main(String[] args) {

            File file = new File("C://Users//Lenovo//Downloads");

            File[] files = file.listFiles();

            for (File file1: files){

                  if(file1.isFile()){
                        System.out.println("File : "+file1.getName());
                  }

                  else if(file1.isDirectory()){
                        System.out.println("Directory : "+ file1.getName());
                  }

                  else
                        System.out.println("Not known : "+ file1.getName());
            }
      }
}
