package com.demo.test;

import com.demo.selection.SelectionSort;

public class TestSort {

	public static void main(String[] args) {
		int [] arr = new int[5];
		SelectionSort.adddata(arr);
		SelectionSort.displaydata(arr);
		SelectionSort.Selectionsort(arr);
		SelectionSort.displaydata(arr);

	}

}
