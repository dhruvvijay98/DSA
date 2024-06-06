package com.demo.test;

import com.demo.selection.InsertionSort;

public class TestSort {

	public static void main(String[] args) {
		int [] arr = new int[5];
		InsertionSort.adddata(arr);
		InsertionSort.displaydata(arr);
		InsertionSort.Insertionsort(arr);
		InsertionSort.displaydata(arr);

	}

}
