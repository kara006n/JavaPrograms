package com.java.program;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;


public class File3 {

      public static void main(String[] args) {

            //String path ="C:\\Users\\Lenovo\\Downloads\\File\\neil.txt";
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter file path wil file name");
            String path = sc.nextLine();
            File file = new File(path);

            try {
                  boolean flag = file.createNewFile();
                  if(flag){
                        System.out.println("file is created");
                  }

                  else{
                        System.out.println("file is already present");
                  }
            } catch (IOException e) {
                  e.printStackTrace();
            }

            //String s = "hello how are you";
            FileOutputStream out = null;
            String s = "";
            while(true){
                  System.out.println("Enter content to write in file");
                  s+= sc.nextLine();
                  System.out.println("Want to write more(Y/N)");
                  String choice = sc.nextLine();
                  if(choice.equals("Y")){
                        s += "\n";
                        System.out.println(s);
                        continue;
                  }
                  else{
                        break;
                  }

            }

            byte[] bytes = s.getBytes();
            try {
                  out = new FileOutputStream(file);
                  out.write(bytes);
                  //System.out.println("true");
            } catch (FileNotFoundException e) {
                  e.printStackTrace();
            } catch (IOException e) {
                  e.printStackTrace();
            }
            finally {
                  try {
                        out.close();
                  } catch (IOException e) {
                        e.printStackTrace();
                  }
            }
      }
}
