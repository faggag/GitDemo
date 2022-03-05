package com.GitLearn;

public class MyClass1 {

    public static void main(String[] args){

        System.out.println("THis is kalpana learning github");
        String s = "kalpana";
        char ch;
        String newStr=" ";
        for(int i=0;i<s.length();i++){

            ch = s.charAt(i);
            newStr = ch+newStr;
        }
        System.out.println(newStr);
    }

}
