package com.bridgelabz.linkedlist;

public class LinkedListProgram <T>{

	class Node{
	    T data;
	    Node next;

	    Node(T data) {
	        this.data = data;
	        this.next = null;
	    }
	}
	  
	Node head = null;
	
	public void createNode (T data) {
		Node newnode = new Node(data);
		
		if(head == null) {    
			head = newnode;
	    }else {
	    	newnode.next = head;
	    	head = newnode;                	        
	    }	    
	}
	
	public void print() {	        
		Node curr_node = head;	        
		while(curr_node != null){	    
			System.out.print( curr_node.data + " ---> ");
			curr_node = curr_node.next;
		}
		System.out.println(" null");  
	}
	
	public static void main(String[] args) {
	        
		LinkedListProgram list = new LinkedListProgram();
	        
	        
		list.createNode(70);	        
		list.createNode(30);	       
		list.createNode(56);
		
		list.print();
		
	}
	
}
