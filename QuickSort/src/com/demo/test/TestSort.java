package com.demo.test;

import com.demo.selection.QuickSort;

public class TestSort {

	public static void main(String[] args) {
		int [] arr = new int[6];
		QuickSort.adddata(arr);
		QuickSort.displaydata(arr);
		int n = arr.length;
		QuickSort.Quicksort(arr,0,n-1);
		QuickSort.displaydata(arr);

	}

}
