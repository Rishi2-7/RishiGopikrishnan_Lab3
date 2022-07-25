package com.greatlearning.service;

import java.util.LinkedHashSet;
import java.util.Set;

import com.greatlearning.models.BinarySearchTreeNode;

public class BinarySearchTreePairFind
{

	private BinarySearchTree tree;
	private boolean found = false;

	public BinarySearchTreePairFind(BinarySearchTree tree)
	{

		this.tree = tree;
	}

	public void findPair(int sum)
	{

		Set<Integer> nodes = new LinkedHashSet<Integer>();

		findPairInternal(sum, tree.getRoot(), nodes);

		if (!found)
		{
			System.out.println("\nSum = " + sum + "\nPrint nodes are not found!");
		}
	}

	private boolean findPairInternal(int sum, BinarySearchTreeNode aNode, Set<Integer> nodes)
	{

		if (aNode == null)
		{
			return false;
		}

		found = findPairInternal(sum, aNode.getLeftNode(), nodes);
		if (found)
		{
			return true;
		}

		int difference = sum - aNode.getData();

		if (nodes.contains(difference)) 
		{

			found = true;
			System.out.println("Sum = " + sum + " \nPair is (" + difference + "," + aNode.getData()  + ")");
			return found;
		}
		else
		{

			nodes.add(aNode.getData());
		}

		if (!found)
		{
			return findPairInternal(sum, aNode.getRightNode(), nodes);
		}
		else
		{
			return true;
		}
	}

}