package com.greatlearning.main;

import com.greatlearning.service.BinarySearchTree;
import com.greatlearning.service.BinarySearchTreePairFind;

public class Driver
{
	public static void main(String[] args)
	{
		test(130);
		test(560);

	}

	private static void test(int sum)
	{

		BinarySearchTree tree = sample1();

		BinarySearchTreePairFind finder = new BinarySearchTreePairFind(tree);

		finder.findPair(sum);

		System.out.println();
	}

	private static BinarySearchTree sample1()
	{

		BinarySearchTree tree = new BinarySearchTree();

		tree.insert(40);
		tree.insert(20);
		tree.insert(60);
		tree.insert(10);
		tree.insert(30);
		tree.insert(50);
		tree.insert(70);
		

		return tree;
	}
}
