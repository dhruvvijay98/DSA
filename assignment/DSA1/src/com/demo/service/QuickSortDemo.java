package com.demo.service;

import java.util.Scanner;

public class QuickSortDemo {

	public static void acceptdata(int[] arr) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter Numbers: ");
			arr[i]= sc.nextInt();
		}
	}

	public static void displaydata(int[] arr) {
		// TODO Auto-generated method stub
		for(int i=0;i<arr.length;i++) {
			System.out.println(i+"--->"+arr[i]);
		}
		System.out.println("-----------------------------------");
	}

	public static void quicksort(int[] arr, int start, int end) {
		// TODO Auto-generated method stub
		if(start<end){
			int p= partition(arr,start,end);
			quicksort(arr,start,p-1);
			quicksort(arr,p+1,end);
		}
		
	}

	private static int partition(int[] arr, int first, int last) {
		int pivot = first;
		int i = first;
		int j =last;
		while(i<j) {
			while(i<last && arr[i]<=arr[pivot])
				i++;
			while(j>pivot && arr[j]>arr[pivot])
				j--;
			if(i<j) {
				int temp = arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				
			}
		}
		int temp = arr[j];
		arr[j] = arr[pivot];
		arr[pivot] = temp;
		System.out.println("pivot"+arr[j]+" is placed at" +j +" position");
displaydata(arr);
return j;
		

		// TODO Auto-generated method stub
	
	}

	

}
