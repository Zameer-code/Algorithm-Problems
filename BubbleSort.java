package com.BridgeLabz1;

/**
 * **************************************************************************** \
 * Purpose: Class is
 * implemented for User Input to Get Integer,Strings and Doubles
 * BubbleSort programme is Generic method
 * @author ZameerAhamad Ron <zameerraone96@gmail.com>
 * @version 1.4
 * @since 15-06-2020 ****************************************************************************
 */

import com.BridgeLabz1.Utility;

public class BubbleSort {
	
	
	public static void main(String[] args) 
	{
		int i,j,temp=0;
		Utility u=new Utility();
		System.out.println("Enter how many numbers to be sorted:");
		int n=u.inputInt();
		int a[]=new int[n];
		System.out.println();
		System.out.println("Enter value for "+n+" numbers:");

		for(i=0;i<a.length;i++)       
		{
		    a[i]=u.inputInt();		//taking input from user
		}

		for(i=0;i<a.length;i++)         //sorting the array
		{
			for(j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println();
		System.out.println("The sorted order is:");

		for(i=0;i<a.length;i++)      
		{
		     System.out.println(a[i]);		//printing the sorted array
		}
	}

}
