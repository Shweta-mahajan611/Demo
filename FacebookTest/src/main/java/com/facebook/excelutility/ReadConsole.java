package com.facebook.excelutility;

import java.util.Scanner;

public class ReadConsole
{
	public static void main(String []args)
	{
		Scanner console = new Scanner(System.in);
		String data = console.nextLine();
	    System.out.println("console data : "+data);
	}
}
