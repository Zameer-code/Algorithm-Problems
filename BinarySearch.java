package com.BridgeLabz1;


import com.BridgeLabz1.SortingFunction;
import javax.swing.text.Utilities;
import java.util.Arrays;

import com.BridgeLabz1.Utility;
/**
 * **************************************************************************** \
 * Purpose: Class is
 * implemented for Printing all the permutations of a given String
 *
 * @author ZameerAhamad Ron <zameerraone96@gmail.com>
 * @version 1.4
 * @since 15-06-2020 ****************************************************************************
 */

public class BinarySearch {
	
	public static void main(String args[])
	{
		SortingFunction sf=new SortingFunction();  
		Utility u=new Utility();

		System.out.println("Enter size: ");
		int arraySize=u.inputInt();
		int a[]=sf.input1DArray(arraySize);
		Arrays.sort(a);								//sorting the array
		System.out.println();
		System.out.println("The Sorted Order is: ");
		sf.print1DArray(a);							//printing the sorted array
		System.out.println();
		System.out.println("Enter Key: ");
		int position=sf.binarySearch(a,u.inputInt());

		if(position==-1)
		{
			System.out.println();
			System.out.println("Not Found");
		}
		else
		{
			System.out.println();
			System.out.println("Found at "+position+" position");
		}
	}

}
