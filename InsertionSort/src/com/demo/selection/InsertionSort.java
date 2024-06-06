package com.demo.selection;

import java.util.Scanner;

public class InsertionSort {
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
	public static void Insertionsort(int[] arr) {
		
		int temp,j;
		for(int i=1;i<arr.length;i++)
		{
			temp= arr[i];
			j=i;
			while(j>0 && arr[j-1]>temp)
			{
				arr[j]=arr[j-1];
				j=j-1;
			}
			arr[j]=temp;
			
	}
	
	

}


}
