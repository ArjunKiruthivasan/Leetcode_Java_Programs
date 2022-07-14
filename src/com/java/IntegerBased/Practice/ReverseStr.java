package com.java.IntegerBased.Practice;

import java.util.Scanner;
public class ReverseStr

{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String str=sc.next();
        String nstr="";
        char ch;
        System.out.println("String :" + str);
        for(int i=0;i<str.length();i++) {
            ch = str.charAt(i);
            nstr=ch + nstr ;
        }
        System.out.println("Reverse String :" + nstr);  
        
        if(str.equalsIgnoreCase(nstr)) {
        	System.out.print("Palindrome");
        } else {
        	System.out.print("No...");
        }
        sc.close();
    }
}