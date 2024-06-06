package com.demo.hashing;

public class Hashing {
	Node [] heads;

	public Hashing(int size) {
		heads = new Node[size];
		for(int i=0;i<heads.length;i++) {
			heads[i]=null;
		}
	}
	
	class Node{
		int data;
		Node next;
		

		public Node(int data) {
			super();
			this.data = data;
			next = null;
		}
		
	}
	
	public void insertdata(int num) {
		int pos = num % heads.length;
		Node newNode = new Node(num);
		if(heads[pos]==null)
		{
			heads[pos]=newNode;
		}
		else {
			newNode.next = heads[pos];
			heads[pos]=newNode;
		}
	}
	
	public boolean searchdata(int num) {
		int pos= num%heads.length;
		if(heads[pos]==null) {
			System.out.println("not found");
			return false;
		}else {
			Node temp = heads[pos];
			while(temp!=null) {
				if(temp.data==num) {
					System.out.println("found");
					return true;
				}else {
					temp=temp.next;
					
				}
				
			}
			System.out.println("not found");
			return false;
		}
	}
	public void displaydata()
	{
		for(int i=0;i<heads.length;i++)
		{
			System.out.print(i+"----->");
			for(Node temp=heads[i]; temp!=null; temp=temp.next)
			{
				System.out.print(temp.data+"---->");
			}
			System.out.println("null");
		}
	}

}
