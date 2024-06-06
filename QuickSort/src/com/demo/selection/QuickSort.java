package com.demo.selection;

import java.util.Scanner;

public class QuickSort {
	public static void adddata(int[] arr) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter elements");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]= sc.nextInt();
		}
		
	}
	public static void displaydata(int[] arr) {
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(i+"--->"+arr[i]);
			
		}
		System.out.println("----------------------------------------->");
	}
	public static void Quicksort(int[] arr, int low, int high) {
		
			int pidx = partition(arr,low,high);
			if(low<pidx-1)
			{
				Quicksort(arr,low,pidx-1);
			}
			if(pidx<high)
			{
				Quicksort(arr,pidx,high);
			}
		}
		
	
	private static int partition(int[] arr, int low, int high) {
		int pivot = arr[(low+high)/2];
		while(low<=high)
		{
			while(arr[low]<pivot)
			{
				low++;
			}
			while(arr[high]>pivot)
			{
				high--;
			}
			if(low<=high)
			{
				int temp =arr[low];
				arr[low]=arr[high];
				arr[high]= temp;
				
				low++;
				high--;
			}
		}
		return low;
	}

}
