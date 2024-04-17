package com.javatest;

import java.util.Scanner;

public class Main {
        static String recursiveString(String str){
            if(str ==null || (str.length() <= 1)) {
                return str;
            }
            return recursiveString(str.substring(1)+str.charAt(0));
        }

        public static void main(String[] arg){
            Scanner sc=new Scanner(System.in);
            int no= sc.nextInt();
            System.out.println("Input - "+no);

        }
   }

