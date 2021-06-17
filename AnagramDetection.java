package com.BridgeLabz1;



public class AnagramDetection {

	
	public static void main(String[] args)
    {
		Utility u=new Utility();
		//taking string input
		System.out.println("Enter 1st String: ");  
		String s=u.inputString();
		System.out.println("Enter 2nd String: ");
		String s1=u.inputString();
		//calling function
		AnagramProgram.isAnagram(s, s1);
	}
}
