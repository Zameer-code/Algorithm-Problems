package com.BridgeLabz1;

/**
 * **************************************************************************** \
 * Purpose: Class is
 * implemented for finding the prime Numbers Between 1 to 1000 and as well as pallindrome
 *
 * @author ZameerAhamad Ron <zameerraone96@gmail.com>
 * @version 1.4
 * @since 15-06-2020 ****************************************************************************
 */

public class Prime {
	
	public static void main(String[] args) {
		System.out.println("prime between 0 to 1000");
		Utility.prime();
		System.out.println("prime no between 0 to 1000 also pallindrome");
		Utility.primePallindrome();
		System.out.println("prime and anagrams");
		Utility.primeAnagrams();
	}

}
