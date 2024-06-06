package com.demo.selection;

import java.util.Scanner;

public class BubbleSort {

	
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
	public static void bubblesort(int[] arr) {
		for(int i=0;i<arr.length;i++)
		{
			int flag=0;
			for(int j=0;j<arr.length-1-i;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					flag = 1;
				}
			}
			if(flag==0)
				break;
		}
		
	}


}
