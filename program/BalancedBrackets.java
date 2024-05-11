package com.java.program;

import java.util.Stack;

public class BalancedBrackets {

      public static void main(String[] args) {

            String input = "( [ { [ ( ) ] } ] )";
            if(balancedBracket(input)){
                  System.out.println("Brackets are balanced");
            }
            else
                  System.out.println("Brackets are not balanced");
      }

      private static boolean balancedBracket(String input) {

            char[] chars = input.toCharArray();
            Stack<Character> stack = new Stack<>();
            for(char c: chars){

                  if(c=='(' || c=='[' || c=='{'){
                        stack.push(c);
                  }

                  else if(c==')' || c==']' || c=='}'){
                        if(stack.isEmpty())
                              return false;

                        char top = stack.pop();
                        if(c=='('&& top==')'|| c=='['&& top==']' || c=='{'&& top=='}'){
                              continue;
                        }

                        /* or we can use this if instead of above
                        if ((c == ')' && top != '(') || (c == '}' && top != '{') || (c == ']' && top != '[')) {
                              return false;
                        }*/
                  }
                  else
                        System.out.println("Invalid character other than bracket");
            }

            return stack.isEmpty();
      }


}
