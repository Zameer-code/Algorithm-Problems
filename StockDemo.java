package com.BridgeLabz1;

import com.BridgeLabz1.Utility;

public class StockDemo {

	public static void main(String args[])
	{
		//get stock details read stock details from fie.txt and display reports.s
		System.out.println(new Utility().getStockDetails("file.txt"));
	}
}
