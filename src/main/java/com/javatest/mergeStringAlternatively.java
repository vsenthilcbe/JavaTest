package com.javatest;

public class mergeStringAlternatively {
    public String mergeAlternatively(String str1, String str2){
        StringBuilder sb=new StringBuilder();
        int i=0;
        while(i < str1.length() || i < str2.length())
        {
            if(i < str1.length()){
                sb.append(str1.charAt(i));
            }
            if(i < str2.length()){
                sb.append(str2.charAt(i));
            }
            i++;
        }
        return sb.toString();
    }

    public static void main(String[] arg){
        mergeStringAlternatively msa = new mergeStringAlternatively();
        System.out.println(msa.mergeAlternatively("abc","def"));
    }
}
