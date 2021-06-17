package com.bridgelabz.utility;

/**
 * **************************************************************************** Purpose: Class is
 * Dequeue of Element
 *
 * @author ZameerAhamad Ron<zameerraone96@gmail.com>
 * @version 1.4
 * @since 17-06-2020 ****************************************************************************
 */


public class Deque<E> {
	public E data;
	public Deque<E>next;
	public Deque<E>pre;
	
	public Deque()
	{
		this.next=null;
		this.pre=null;
	}
	
	public Deque(E val)
	{
		this.data=val;
		this.next=null;
		this.pre=null;
	}

}
