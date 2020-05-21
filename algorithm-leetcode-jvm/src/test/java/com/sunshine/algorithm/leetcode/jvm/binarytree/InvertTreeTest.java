package com.sunshine.algorithm.leetcode.jvm.binarytree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author sunshine
 * @created 2020-05-22
 */
@DisplayName("翻转二叉树单元测试")
public class InvertTreeTest {

	@Test
	public void invertTreeTest() {
		TreeNode root = new TreeNode(4);
		root.left = new TreeNode(2);
		root.right = new TreeNode(7);
		root.left.left = new TreeNode(1);
		root.left.right = new TreeNode(3);
		root.right.left = new TreeNode(6);
		root.right.right = new TreeNode(9);
		TreeNode expected = new TreeNode(4);
		expected.left = new TreeNode(7);
		expected.right = new TreeNode(2);
		expected.left.left = new TreeNode(9);
		expected.left.right = new TreeNode(6);
		expected.right.left = new TreeNode(3);
		expected.right.right = new TreeNode(1);
		Assertions.assertEquals(expected, new InvertTree().invertTree(root));
	}

	@Test
	public void invertTreeRecursionTest() {
		TreeNode root = new TreeNode(4);
		root.left = new TreeNode(2);
		root.right = new TreeNode(7);
		root.left.left = new TreeNode(1);
		root.left.right = new TreeNode(3);
		root.right.left = new TreeNode(6);
		root.right.right = new TreeNode(9);
		TreeNode expected = new TreeNode(4);
		expected.left = new TreeNode(7);
		expected.right = new TreeNode(2);
		expected.left.left = new TreeNode(9);
		expected.left.right = new TreeNode(6);
		expected.right.left = new TreeNode(3);
		expected.right.right = new TreeNode(1);
		Assertions.assertEquals(expected, new InvertTree().invertTreeRecursion(root));
	}
}
