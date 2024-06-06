package com.demo.selection;
import java.util.Scanner;

public class SelectionSort {

		public static void adddata(int[] arr) {
			Scanner sc = new Scanner(System.in);
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
		public static void Selectionsort(int[] arr) {
			for(int i=0;i<arr.length;i++)
			{
				int min=i;
				for(int j=i+1;j<arr.length;j++)
				{
					if(arr[j]<arr[min])
					{
						min=j;
					}
				}
				int temp=arr[i];
				arr[i]=arr[min];
				arr[min]=temp;
			
			}
		

	}


}
