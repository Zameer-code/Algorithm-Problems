package com.BridgeLabz1;


/**
 * **************************************************************************** \
 * Purpose: Class is
 * implemented for user input to get Integer,String and Doubles
 * his InsertionSort program is Generic type.
 *
 * @author ZameerAhamad Ron <zameerraone96@gmail.com>
 * @version 1.4
 * @since 15-06-2020 ****************************************************************************
 */

import java.util.Arrays;
import com.BridgeLabz1.Utility;

public class InsertionSort {

	
	public static void main(String[] args) 
	{	
		Utility u=new Utility();
		System.out.println("Enter no. of words to be printed: ");
		int n=u.inputInt();
		 
		//create string array
		String array[]=new String[n];
		System.out.println();	
		System.out.println("Enter the words to be printed: ");

		for(int i=0;i<array.length;i++)
		{
			array[i]=u.inputString();
		}
		System.out.println();
	       
		//sort string array using Arrays.sort method
		System.out.println("Sorted order is: ");
		for(int i=0;i<array.length;i++)
		{
			Arrays.sort(array);
			System.out.println(array[i]);
		}
		
	}
}

