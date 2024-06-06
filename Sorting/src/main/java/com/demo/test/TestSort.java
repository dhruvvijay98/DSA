package com.demo.test;

import com.demo.selection.BubbleSort;

public class TestSort {

	public static void main(String[] args) {
		int [] arr = new int[5];
		BubbleSort.adddata(arr);
		BubbleSort.displaydata(arr);
		BubbleSort.bubblesort(arr);
		BubbleSort.displaydata(arr);

	}

}
