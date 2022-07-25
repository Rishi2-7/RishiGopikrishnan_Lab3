package com.greatlearning.service;

import com.greatlearning.models.Bracket;


import java.util.Set;
import java.util.Stack;


public class BracketChecker
{
	private String brackets;

	public BracketChecker(String brackets)
	{
		this.brackets = brackets;
	}

	public boolean check()
	{
		if (brackets.length() % 2 != 0)
		{
			return false;
		}

		Stack<Character> stack = new Stack<Character>();

		Set<Character> openBracketSet = BracketManager.getOpenBracketCharSet();

		Set<Character> getCloseBrackets = BracketManager.getCloseBrackets();

		for (int index = 0; index < brackets.length(); index++)
		{
			char aChar = brackets.charAt(index);

			if (openBracketSet.contains(aChar))
			{

				stack.push(aChar);

			}
			else if (getCloseBrackets.contains(aChar))
			{
				char closedChar = aChar;

				Character opeCharFromStack = stack.pop();
				Bracket bracketObj = BracketManager.getBracket(closedChar);
				if (opeCharFromStack.equals(bracketObj.getOpenBracket()))
				{
					continue;
				}
			}
			else
			{

				System.out.println("Invalid character encountered " + "during traversal.." + aChar);
				return false;
			}
		}

		return stack.isEmpty();
	}

}