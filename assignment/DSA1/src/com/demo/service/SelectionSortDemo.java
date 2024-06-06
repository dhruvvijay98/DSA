package com.demo.service;

import java.util.Scanner;

public class SelectionSortDemo {

	public static void acceptdata(int[] arr) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter number:  ");
			arr[i]= sc.nextInt();
		}
	}
	public static void displaydata(int[] arr) {
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(i+"------>"+arr[i]);
		}
		System.out.println("-------------------------------------");
	}

	public static void sortascending(int[] arr) {
		for(int i=0;i<arr.length;i++) {
		 int minidx = findminm(arr,i,arr.length);
		 int temp = arr[i];
		 arr[i] = arr[minidx];
		 arr[minidx] = temp;
		}
		
	}

	private static int findminm(int[] arr, int start, int end) {
		int min = arr[start];
		int minidx = start;
		for(int i=start;i<arr.length;i++) {
			if(arr[i]<min) {
				min = arr[i];
				minidx=i;
			}
		}
		return minidx;
	}
	public static void sortdescending(int[] arr) {
		for(int i=0;i<arr.length-1;i++) {
			int maxidx = findmax(arr,i,arr.length);
			int temp=arr[i];
			arr[i]=arr[maxidx];
			arr[maxidx]=temp;
		}
		
		
	}
	private static int findmax(int[] arr, int start, int end) {
		int max = arr[start];
		int maxidx = start;
		for(int i=start;i<end;i++) {
			if(arr[i]>max) {
				max = arr[i];
				maxidx=i;
			}
		}
		return maxidx;
	}

}
