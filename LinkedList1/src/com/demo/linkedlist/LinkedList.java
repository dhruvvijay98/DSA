package com.demo.linkedlist;

public class LinkedList {
	public Node head;
	
	class Node{
		int data;
		Node next;
		
		public Node() {
			
			data = 0;
			next=null;
		}

		public Node(int val) {
			
		data = val;
			next=null;
		}
		
	}	

		public void addnodebypos(int val,int pos)
		{
			
			if(head==null)
			{
				System.out.println("list is empty");
			}
			else
			{
				Node newNode = new Node(val);
				if(pos==1) {
					newNode.next = head;
					head = newNode;
				}
				else {
					Node temp = head;
					
					for(int i=0;temp!=null && i<pos-2;i++)
					{
						temp=temp.next;
					}
					if(temp!=null)
					{
						newNode.next=temp.next;
						temp.next=newNode;
					}
				}
			}
		}
		
		

	public void addnode(int val) {
		// TODO Auto-generated method stub
		Node newNode = new Node(val);
		if(head==null)
		{
			head = newNode;
		}
		else
		{
			Node temp = head;
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			temp.next=newNode;
		}
	}

	public void displaynode() {
		{
			if(head==null)
			{
				System.out.println("list is empty");
			}
			else
			{
				for(Node temp=head; temp!=null;temp=temp.next)
				{
					System.out.print(temp.data+",");
				}
			}
		}
		
		
	}
	

	}
	

