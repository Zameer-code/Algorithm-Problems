package com.bridgelabz.utility;

public class Node<E> {
	public String data1;
	public int data;
	public Node nextNode;
	
	//constructor
	public Node()
	{
		this.nextNode=null;
	}

	public void setData(String data1)
	{
		this.data1=data1;
		nextNode=null;
	}
	
	public void setData(int data)
	{
		this.data=data;
		nextNode=null;
	}

	public Node getLink() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setLink(Node node) {
		// TODO Auto-generated method stub
		
	}

	public int getData() {
		// TODO Auto-generated method stub
		return 0;
	}

}
