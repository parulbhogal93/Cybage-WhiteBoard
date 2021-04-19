package com.DemoProject.ProcessArrays;

import java.util.Scanner;

public class SortDescending {
	private static Scanner sc;

	public static void main(String[] args) {
		int Size, i, j, Temp;
		sc = new Scanner(System.in);

		System.out.print(" Please Enter Number of elements in an array : ");
		Size = sc.nextInt();

		int[] a = new int[Size];

		System.out.print(" Please Enter " + Size + " elements of an Array  : ");
		for (i = 0; i < Size; i++) {
			a[i] = sc.nextInt();
		}

		for (i = 0; i < Size; i++) {
			for (j = i + 1; j < Size; j++) {
				if (a[i] < a[j]) {
					Temp = a[i];
					a[i] = a[j];
					a[j] = Temp;
				}
			}
		}

		System.out.print("\nArray in descending  :  ");
		for (i = 0; i < Size; i++) {
			System.out.print(a[i] + " ");
		}
	}
}
