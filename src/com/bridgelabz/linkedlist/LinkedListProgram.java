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
	
	public void append (T data) {
		Node newnode = new Node(data);
		if(head == null) {    
			head = newnode;
	    }else {
	    	Node currnode = head;
	    	while(currnode.next != null) {
	    		currnode = currnode.next;    
	    	}	            
	    	currnode.next = newnode;	        
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
		
		list.append(56);	        
		list.append(30);	       
		list.append(70);
		list.print();
		
	}
	
}
