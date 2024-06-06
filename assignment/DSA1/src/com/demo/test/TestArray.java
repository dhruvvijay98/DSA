package com.demo.test;

import com.demo.service.ArrayService;

public class TestArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
               int[] arr = new int[5];
               ArrayService.acceptdata(arr);
               ArrayService.displaydata(arr);
//               int num =ArrayService.findmax(arr);
//               if(num!=0)
//               {
//            	   System.out.println("max is: "+num);
//               }
//               else
//            	   System.out.println("not found");
//               int num1=ArrayService.findevenmax(arr);
//               if(num1!=0)
//               {
//            	   System.out.println("even max is: "+num1);
//               }
//               else
//            	  System.out.println("not found");
//            	 
//            	   
//               ArrayService.findsumofdigits(arr);
               ArrayService.findduplicates(arr);
               
	}

}
