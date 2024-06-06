package com.demo.adjescency;

import java.util.Scanner;

public class Adjescencylist {
	Node [] heads;
	public Adjescencylist(int num){
		heads= new Node[num]; 
	}
	class Node{
		int data;
		Node next;
		Node(int val) {
			data=val;
			next=null;
		}
	}
	
	public void addgraph() {
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<heads.length;i++) {
			for(int j=0;j<heads.length;j++) {
				System.out.println("edge :"+i+"--->"+j+":");
				int num = sc.nextInt();
				if(num==1) {
					Node newNode = new Node(j);
					if(heads[i]==null) {
						
						heads[i]=newNode;
					}
					else {
						
						newNode.next=heads[i];
						heads[i]=newNode;
					}
						
						
					}
				}
			}
		}
	
	public void displaydata() {
		for(int i=0;i<heads.length;i++) {
			System.out.println("node:"+i+":");
			for(Node temp=heads[i];temp!=null;temp=temp.next) {
				System.out.print(temp.data+"--->");
			}
			System.out.println("null");
		}
	}

}
