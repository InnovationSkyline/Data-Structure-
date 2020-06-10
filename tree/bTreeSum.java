//package tree;
//
///**
// * 	 Tree will look like this
// * 
// *         2
// *       /   \
// *      3     5
// *       \   /
// *        9 7
// */
//
//import java.util.*;
//
//class Node {
//	int data;
//	Node left;
//	Node right;
//	
//	Node(int data){
//		this.data = data;
//		this.left = null;
//		this.right = null;
//	}
//}
//
//class BinaryTree {
//	Node root;
//	
//	BinaryTree(){
//		this.root = null;
//	}
//	
//	BinaryTree(int data) {
//		this.root = new Node(data);
//	}
//
//	int treeSum(Node root) { 
//		if(root != null)
//			return root.data + treeSum(root.left) + treeSum(root.right);
//		return 0;
//	}
//}
//
//public class bTreeSum {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		
//		//explicit linking
//		BinaryTree bt = new BinaryTree(2); // BinaryTree with root node 2
//		bt.root.left = new Node(3);
//		bt.root.right = new Node(5);
//		bt.root.left.right = new Node(9);
//		bt.root.right.left = new Node(7);
//		
//		System.out.println("Sum of all nodes of binary tree is: " + bt.treeSum(bt.root));
//		
//	}
//}