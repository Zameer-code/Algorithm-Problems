package com.BridgeLabz1;

import java.util.Arrays;



/**
 * **************************************************************************** \
 * Purpose: Class is
 * implemented for User Input as Integers,Strings and Doubles
 * @author ZameerAhamad Ron <zameerraone96@gmail.com>
 * @version 1.4
 * @since 15-06-2020 ****************************************************************************
 */
public class BinarySearchString {
	
	public static void main(String[] args)
	{
		SortingFunction sf=new SortingFunction();  
		Utility u=new Utility();
		System.out.println("Enter number of words to be sorted: ");
		int arraySize1=u.inputInt();
		String b[]=sf.input1DStringArray(arraySize1);
		Arrays.sort(b);									//sorting the array
		System.out.println();

		System.out.println("The Sorted Order is: ");
		sf.print1DStringArray(b);						//printing the sorted array
		System.out.println();

		System.out.println("Enter Key: ");
		int p=sf.binarySearchString(b,u.inputString());

		if(p==-1)
		{
			System.out.println();
			System.out.println("Not Found");
		}
		else
		{
			System.out.println();
			System.out.println("Found at "+p+" position");
		}	        
	}

}
