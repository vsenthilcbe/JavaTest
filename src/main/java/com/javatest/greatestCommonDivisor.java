package com.javatest;

public class greatestCommonDivisor {

    public boolean valid(String str1, String str2, int k){
        int len1=str1.length(), len2=str2.length();
        if(len1 % k > 0 || len2 % k > 0) {
            return false;
        }else{
            String base=str1.substring(0,k);
            return str1.replace(base,"").isEmpty() && str2.replace(base,"").isEmpty();
        }


    }

    public String gcdStrings(String str1, String str2){
        int len1=str1.length(), len2=str2.length();
        for(int i=Math.min(len1,len2); i >=1; --i){
            if(valid(str1,str2,i))
                return str1.substring(0,i);
        }
        return "";
    }

    public static void main(String[] arg){
        greatestCommonDivisor gcd=new greatestCommonDivisor();
        System.out.println(gcd.gcdStrings("ababababababab","ab"));
    }
}