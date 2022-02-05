package tree;

import java.util.*;

class Node {
	int data;
	Node left;
	Node right;
	
	Node(int data){
		this.data = data;
		this.left = null;
		this.right = null;
	}
}

class BinaryTree {
	Node root;
	
	BinaryTree(){
		this.root = null;
	}
	
	BinaryTree(int data) {
		this.root = new Node(data);
	}
	
	void levelOrder() {
		Queue<Node> q = new LinkedList<>();
		q.add(this.root);
		q.add(null);
		
		System.out.println("Level order of Binary Tree");
		while(!q.isEmpty()) {
			Node node = q.remove();
			if(node == null && !q.isEmpty()) {
				System.out.println();
				q.add(null);
			}
			
			if(node != null) {
				if(node.left != null)
					q.add(node.left);
				if(node.right != null)
					q.add(node.right);
			
				System.out.print(node.data + " ");
			}
		}
		
		System.out.println();
	}
	
	Node toMirror(Node root) {
		
		if(root == null) return null;
		
		Node left = toMirror(root.left);
		Node right = toMirror(root.right);
		
		root.left = right;
		root.right = left;
		
		return root;
	}
}

public class toMirrorTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree bt = new BinaryTree(2); // BinaryTree with root node 2
		bt.root.left = new Node(3);
		bt.root.right = new Node(5);
		bt.root.left.right = new Node(9);
		bt.root.right.left = new Node(7);
		bt.levelOrder();
		
		bt.root = bt.toMirror(bt.root);
		bt.levelOrder();
	}

}
