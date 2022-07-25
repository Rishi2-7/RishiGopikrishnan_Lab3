package com.greatlearning.main;

import com.greatlearning.service.BracketChecker;

public class Driver
{
	public static void main(String[] args)
	{
		test("([[{}]])");
		test("([[{}]]))");
	}

	private static void test(String brackets)
	{

		BracketChecker checker = new BracketChecker(brackets);
		boolean result = checker.check();
		System.out.println();
		if (result)
		{
			System.out.println("Given,Bracket expression : '" + brackets
					+ "' \nThe entered String has Balanced Brackets");
		}
		else
		{
			System.out.println("Given,Bracket expression : '" + brackets
					+ "' \nThe entered Strings do not contain Balanced Brackets");
		}
	}

}
