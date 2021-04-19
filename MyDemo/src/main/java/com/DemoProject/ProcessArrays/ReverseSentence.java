package com.DemoProject.ProcessArrays;

import java.util.Scanner;

public class ReverseSentence {
	public static void main(String[] args) {
		System.out.println("Enter your sentence");
		Scanner scan = new Scanner(System.in);
		String inputString = scan.nextLine();
		String[] words = inputString.split("\\s");
		String outputString = " ";
		for (int i = words.length - 1; i >= 0; i--) {
			outputString = outputString + words[i] + " ";
		}
		System.out.println("Output String :" + outputString);
		scan.close();
	}
}
