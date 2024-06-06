package com.demo.service;

import java.util.Scanner;

public class ArrayService {
	public static void acceptdata(int[] arr) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Numbers : ");
		for(int i=0;i<arr.length;i++) {
			
			arr[i]=sc.nextInt();
		}
		
	}

	public static void displaydata(int[] arr) {
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(i+"---> "+arr[i]);
			
			
		}
		
	}

	public static void Quicksort(int[] arr, int i, int j) {
		
		
	}

}
