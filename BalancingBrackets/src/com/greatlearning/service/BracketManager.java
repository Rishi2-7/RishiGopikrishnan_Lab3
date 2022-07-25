package com.greatlearning.service;

import com.greatlearning.models.Bracket;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class BracketManager
{
	private static Set<Bracket> predifinedBrackets;

	static
	{

		predifinedBrackets = new LinkedHashSet<Bracket>();

		predifinedBrackets.add(new Bracket('(', ')'));

		predifinedBrackets.add(new Bracket('[', ']'));

		predifinedBrackets.add(new Bracket('{', '}'));

		predifinedBrackets.add(new Bracket('<', '>'));

	}

	public static Set<Character> getOpenBracketCharSet()
	{
		Set<Character> result = new LinkedHashSet<Character>();
		Iterator<Bracket> iterator = predifinedBrackets.iterator();
		while (iterator.hasNext())
		{
			Bracket bracket = iterator.next();
			result.add(bracket.getOpenBracket());
		}
		return result;
	}

	public static Set<Character> getCloseBrackets()
	{
		Set<Character> result = new LinkedHashSet<Character>();
		Iterator<Bracket> iterator = predifinedBrackets.iterator();
		while (iterator.hasNext())
		{
			Bracket bracket = iterator.next();
			result.add(bracket.getCloseBracket());
		}
		return result;
	}

	public static Bracket getBracket(Character closeBracket)
	{
		for (Bracket predefinedBracket : predifinedBrackets)
		{
			if (predefinedBracket.getCloseBracket().equals(closeBracket))
			{
				return predefinedBracket;
			}
		}
		return null;
	}

}