package org.fmz.container;


public class BinarySearchTree extends BinaryTree {

	// A BST needs Comparable nodes because a BST is totally ordered

	public static class BSTNode extends BinaryTreeNode implements Comparable {


		public void finalize() throws Throwable {
			super.finalize();
		}

		/**
		 * 
		 * @param dat
		 */
		public BSTNode(Comparable dat){
			super(dat) ;
		}

		/**
		 * 
		 * @param dat
		 * @param lc
		 * @param rc
		 * @param par
		 */
		public BSTNode(Comparable dat, BSTNode lc, BSTNode rc, BSTNode par){
			super(dat, lc, rc, par) ;
		}

		/**
		 * 
		 * @param o
		 */
		public int compareTo(Object o){
			return ((Comparable)data).compareTo(((BSTNode)o).data) ;
		}

	}

	public BinarySearchTree(){

	}

	public void finalize() throws Throwable {
		super.finalize();
	}

	/**
	 * 
	 * @param target
	 */
	public Comparable find(BSTNode target){
		BSTNode found = findHelper((BSTNode)root, new BSTNode(target)) ;

		if(found ==  null)
			return null ;
		return (Comparable)found.data ;
	}

	/**
	 * 
	 * @param current
	 * @param target
	 */
	protected BSTNode findHelper(BSTNode current, BSTNode target){
		// If we have left the tree, then the target was not found
		// This method is recusive

		if(current == null)
			return null ;

		// If the target node is less than the current node, then turn left

		if(target.compareTo(current) < 0)
			return findHelper((BSTNode)current.leftChild, target) ;

		// If the target node is greater than the currnt node, then turn right

		if(target.compareTo(current) > 0)
			return findHelper((BSTNode)current.leftChild, target) ;

		// Otherwise the currnt node is the target node

		return current ;
	}

	/**
	 * 
	 * @param newItem
	 */
	public void insert(Comparable newItem){
		root = insertHelper((BSTNode)root, new BSTNode(newItem)) ;
	}

	/**
	 * 
	 * @param current
	 * @param newNode
	 */
	protected BSTNode insertHelper(BSTNode current, BSTNode newNode){
		// If we have found the correct location for the node, then return the reference to the new node, linking it to the tree
		// This method is recusive

		if(current == null){
			numItems ++ ;
			return newNode ;
		}

		// If the new node is less than the current node, then go left
		// otherwise go right

		if(newNode.compareTo(current) < 0){
			current.leftChild = insertHelper((BSTNode)current.leftChild, newNode) ;
			current.leftChild.parent = current ;
		}else{
			current.rightChild = insertHelper((BSTNode)current.rightChild, newNode) ;
			current.rightChild.parent = current ;
		}
		return current ;
	}

	/**
	 * 
	 * @param current
	 */
	protected BSTNode maxHelper(BSTNode current){
		// This method is not recusive, because the maximum nodes of a BST is easy to find using a loop;
		// go right until the rightmost node if found

		if(current == null)
			return null ;
		while(current.rightChild != null)
			current = (BSTNode)current.rightChild ;
		return current ;
	}

	public Comparable maximum(){
		BSTNode max = maxHelper((BSTNode)root) ;
		if(max == null)
			return null ;
		return (Comparable)max.data ;
	}

	/**
	 * 
	 * @param current
	 */
	protected BSTNode minHelper(BSTNode current){
		// This minimum node of a BST is the leftmost node

		if(current == null)
			return null ;
		while(current.leftChild != null)
			current = (BSTNode)current.leftChild ;
		return current ;
	}

	public Comparable minimum(){
		BSTNode min = minHelper((BSTNode)root) ;
		if(min == null)
			return null ;
		return (Comparable)min.data ;
	}

	/*
	 * The inorder predecessor of node n is
	 * 1. the maximum node of n's left subtree, provided that n has a left subtree
	 * 2. the first ancessor of n such that n is in the ancessor's right subtree
	 */ 

	/**
	 * 
	 * @param target
	 */
	public Comparable predecessor(Comparable target){
		BSTNode found = findHelper((BSTNode)root, new BSTNode(target)) ;
		if(found == null)
			return null ;
		if(found.leftChild != null)
			return (Comparable)maxHelper((BSTNode)found.leftChild).data ;
		BSTNode parent = (BSTNode)found.parent ;
		while(parent != null && parent.compareTo(found) > 0)
			parent = (BSTNode)parent.parent ;
		if(parent == null)
			return null ;
		return (Comparable)parent.data ;
	}

	/**
	 * 
	 * @param target
	 */
	public void remove(Comparable target){
		removeHelper((BSTNode)root, new BSTNode(target)) ;
	}

	/*
	 * 1. Find the node to be removed. If no such node exists, terminate.
	 * 2.  (1) if(the node to be removed is a leaf)
	 			If the target node has a parent, i.e., if the target node is not the root, then overwrite the parent's reference to the target node
	 			with null, unlinking the target node from the tree.
	 	   (2) else if(the target node has no left child)
	 	   		Overwirte the target node's data portion and the links to its children with those of its right child, effectively transforming the
	 	   		node into its right child.
	 	   (3) else if(the target node has no right child)
	 	   		Transform the target node into its left child.
	 	   (4) else // the target node has two childern
				Replace the target node's data portion with that of its successor, which is the minimum node of the target node's right subtree. Then
				delete the successor, to which case (1) or case (2) must apply.
	 */

	/**
	 * 
	 * @param current
	 * @param target
	 */
	protected BSTNode removeHelper(BSTNode current, BSTNode target){
		if(current == null)
			return null ;
		if(target.compareTo(current) < 0)
			current.leftChild = removeHelper((BSTNode)current.leftChild, target) ;
		else if(target.compareTo(current) > 0)
			current.rightChild = removeHelper((BSTNode)current.rightChild, target) ;
		else{
			if(current.isLeaf()){
				numItems -- ;
				return null ;
			}
			BSTNode temp ;
			if(current.leftChild == null){
				temp = (BSTNode)current.rightChild ;
				current.data = temp.data ;
				current.leftChild = temp.leftChild ;
				if(current.leftChild != null)
					current.leftChild.parent = current ;
				current.rightChild = temp.rightChild ;
				if(current.rightChild != null)
					current.rightChild.parent = current ;
			}
			else if(current.rightChild == null){
				temp = (BSTNode)current.leftChild ;
				current.data = temp.data ;
				current.leftChild = temp.leftChild ;
				if(current.leftChild != null)
					current.leftChild.parent = current ;
				current.rightChild = temp.rightChild ;
				if(current.rightChild != null)
					current.rightChild.parent = current ;
			}
			else{
				temp = (BSTNode)current.rightChild ;
				if(temp.isLeaf()){
					current.data = temp.data ;
					current.rightChild = null ;
				}
				else if(temp.leftChild == null){
					current.data = temp.data ;
					current.rightChild = temp.rightChild ;
					if(current.rightChild != null)
						current.rightChild.parent = current ;
				}
				else{
					while(temp.leftChild.leftChild != null)
						temp = (BSTNode)temp.leftChild ;
					current.data = temp.leftChild.data ;
					removeHelper((BSTNode)temp, new BSTNode((Comparable)temp.leftChild.data)) ;
					numItems ++ ;
				}
			}
			numItems -- ;
		}
		return current ;
	}

	/*
	 * The inorder successor of node n is
	 * 1. the minimum node of n's right subtree, provided that n has a right subtree
	 * 2. the first ancessor of n such that n is in the ancessor's left subtree
	 */ 

	/**
	 * 
	 * @param target
	 */
	public Comparable successor(Comparable target){
		BSTNode found = findHelper((BSTNode)root, new BSTNode(target)) ;
		if(found == null)
			return null ;
		if(found.rightChild != null)
			return (Comparable)minHelper((BSTNode)found.rightChild).data ;
		BSTNode parent = (BSTNode)found.parent ;
		while(parent != null && parent.compareTo(found) <= 0)
			parent = (BSTNode)parent.parent ;
		if(parent == null)
			return null ;
		return (Comparable)parent.data ;
	}

}