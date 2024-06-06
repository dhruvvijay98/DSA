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
		// TODO Auto-generated method stub
		for(int i=0;i<arr.length;i++) {
			System.out.println(i+"---> "+arr[i]);
			
			
		}
		
	}

	public static int findmax(int[] arr) {
		int max = 0;
		for(int i =1;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max= arr[i];
			}
		}
		return max;
	}

	public static int findevenmax(int[] arr) {
		int max =0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max && arr[i]%2==0)
			{
				max=arr[i];
			}
		}
		
		return max;
		
	}

	public static int finddigitsum(int num) {
		int sum = 0;
		while(num>0)
		{
			int d = num%10;
			sum=sum + d;
			num = (int)num/10;
		}
		return sum;
			
			
		
	}

	public static void findsumofdigits(int[] arr) {
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
		int s= finddigitsum(arr[i]);
		System.out.println(s);
		sum=sum+s;
		}
		System.out.println("total sum: "+sum);
	}

	public static void findduplicates(int[] arr) {
//		int count = 0;
//		int index=0;
//		int[] arr1 = new int[arr.length/2];
//		for(int i=0;i<arr.length-1;i++) {
//			int num =arr[i];
//			for(int j=i+1;j<arr.length;j++) {
//				if(num==arr[j]) {
//					arr1[index]=num;
//					index++;
//					break;
//					
//				}
//				
//			}
//		}
//		for(int i=0;i<arr1.length;i++) {
//		System.out.println(arr1[i]);
//		}
		
	}

}
