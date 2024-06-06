package com.demo.test;

import com.demo.tree.*;

public class TestBinary {

	public static void main(String[] args) {
		BinarySearch tree=new BinarySearch();
	    tree.insertkey(60);
	    tree.insertkey(35);
	    tree.insertkey(40);
	    tree.insertkey(20);
	    tree.insertkey(75);
	    tree.insertkey(70);
	    tree.insertkey(80);
	    //inorderTraversal
	    tree.inorder();   //20,35,40,60,70,75,80
	    System.out.println("---------");
	  //preorderTraversal
	    tree.preorder();//60,35,20,40,75,70,80
	    System.out.println("---------");
	  //preorderTraversal
	    tree.postorder(); //20,40,35,70,80,75,60
	    System.out.println("---------");
	    
	}
    

	

}
