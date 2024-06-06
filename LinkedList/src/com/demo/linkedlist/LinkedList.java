package com.demo.linkedlist;

public class LinkedList {
	public Node head;
	
	class Node{
		int data;
		Node next;
		
		public Node() {
			
			this.data = 0;
			next=null;
		}

		public Node(int val) {
			
			this.data = val;
			next=null;
		}
		
		public void addnode(int val)
		{
			Node newNode = new Node(val);
			if(head==null)
			{
				head = newNode;
			}
			else
			{
				Node temp = head;
				while(temp!=null)
				{
					temp=temp.next;
				}
				temp.next=newNode;
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
					
					for(int i=0;temp!=null && i<pos-1;i++)
					{
						temp=temp.next;
					}
					if(temp!=null)
					{
						newNode.next=temp;
						temp=newNode.next;
					}
				}
			}
		}
		
		public void displaynode()
		{
			if(head==null)
			{
				System.out.println("list is empty");
			}
			else
			{
				for(Node temp=head; temp!=null;temp=temp.next)
				{
					System.out.println(temp.data+",");
				}
			}
		}
		
	}
	

}
