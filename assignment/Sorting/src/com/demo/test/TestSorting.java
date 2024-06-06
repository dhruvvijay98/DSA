package com.demo.test;

import com.demo.service.ArrayService;

public class TestSorting {

	public static void main(String[] args) {
		int [] arr = new int [5];
		int n = arr.length;
		 ArrayService.acceptdata(arr);
         ArrayService.displaydata(arr);
         
        ArrayService.Quicksort(arr,0,n-1);

	}

}
