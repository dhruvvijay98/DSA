package com.demo.test;

import com.demo.linkedlist.LinkedList;

public class TestLL {

	public static void main(String[] args) {
		LinkedList mylist = new LinkedList(); 
		
		mylist.addnode(5);
		mylist.addnode(3);
		mylist.addnode(7);
		mylist.addnode(11);
		mylist.displaynode();
		System.out.println("\n--------------------\n");
		
		mylist.addnodebypos(12, 1);
		mylist.addnodebypos(153, 3);
		
		mylist.displaynode();
	}

}
