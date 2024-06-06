package com.demo.test;

import com.demo.service.QuickSortDemo;

public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[7];
		QuickSortDemo.acceptdata(arr);
		QuickSortDemo.displaydata(arr);
		QuickSortDemo.quicksort(arr,0,arr.length-1);

	}

}
