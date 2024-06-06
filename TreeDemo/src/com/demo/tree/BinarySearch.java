package com.demo.tree;

import org.w3c.dom.Node;

public class BinarySearch {
	Node root;

	public BinarySearch() {
		root=null;
	}
	class Node{
		int data;
		Node left;
		Node right;
		public Node(int data) {
			
			this.data = data;
			left = null;
			right=null;
		}
		
	}
	
	public void insertkey(int val) {
		root = insertdata(root,val);
	}

	private Node insertdata(Node root, int val) {
		Node newNode = new Node(val);
		if(root==null) {
			root = newNode;
			return root;
		}else {
			if(val<root.data) {
				root.left = insertdata(root.left,val);
			}else {
				root.right = insertdata(root.right,val);
			}
			return root;
		}
	}
	public void inorder()
	{
		inordertraversal(root);
	}

	private void inordertraversal(Node root) {
		if(root!=null) {
		inordertraversal(root.left);
		System.out.println(root.data);
		inordertraversal(root.right);}
		
	}
	public void preorder()
	{
		preordertraversal(root);
	}

	private void preordertraversal(Node root) {
		if(root!=null) {
		System.out.println(root.data);
		inordertraversal(root.left);
		inordertraversal(root.right);
		}
		
	}
	public void postorder()
	{
		postordertraversal(root);
	}

	private void postordertraversal(Node root) {
		if(root!=null) {
		inordertraversal(root.left);
		inordertraversal(root.right);
		System.out.println(root.data);}
		
	}

}
