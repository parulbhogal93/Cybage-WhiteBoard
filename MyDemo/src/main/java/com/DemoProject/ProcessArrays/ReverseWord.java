package com.DemoProject.ProcessArrays;

import java.util.Scanner;

public class ReverseWord {
    public static void main(String[] args){	
    Scanner scan = new Scanner(System.in);
    System.out.print("\nInput a word: ");
	 String word = scan.nextLine();
	 word = word.trim();
	 String result = ""; 
    char[] ch=word.toCharArray();  
	 for (int i = ch.length - 1; i >= 0; i--) {
			 result += ch[i];
		 }
	 System.out.println("Reverse word: "+result.trim()); 
	 scan.close();
	 }
}
