package org.fmz.container;


public class BinarySearchTree extends BinaryTree {

	public class BSTNode extends BinaryTreeNode {

		public BSTNode(){

		}

		public void finalize() throws Throwable {
			super.finalize();
		}

		/**
		 * 
		 * @param dat
		 */
		public BSTNode(Comparable dat){

		}

		/**
		 * 
		 * @param dat
		 * @param lc
		 * @param rc
		 * @param par
		 */
		public BSTNode(Comparable dat, BSTNode lc, BSTNode rc, BSTNode par){

		}

		/**
		 * 
		 * @param o
		 */
		public int compareTo(Object o){
			return 0;
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
		return null;
	}

	/**
	 * 
	 * @param current
	 * @param target
	 */
	protected BSTNode findHelper(BSTNode current, BSTNode target){
		return null;
	}

	/**
	 * 
	 * @param newItem
	 */
	public void insert(Comparable newItem){

	}

	/**
	 * 
	 * @param current
	 * @param newNode
	 */
	protected BSTNode insertHelper(BSTNode current, BSTNode newNode){
		return null;
	}

	/**
	 * 
	 * @param current
	 */
	protected BSTNode maxHelper(BSTNode current){
		return null;
	}

	public Comparable maximum(){
		return null;
	}

	/**
	 * 
	 * @param current
	 */
	protected BSTNode minHelper(BSTNode current){
		return null;
	}

	public Comparable minimum(){
		return null;
	}

	/**
	 * 
	 * @param target
	 */
	public Comparable predecessor(Comparable target){
		return null;
	}

	/**
	 * 
	 * @param target
	 */
	public void remove(Comparable target){

	}

	/**
	 * 
	 * @param current
	 * @param target
	 */
	protected BSTNode removeHelper(BSTNode current, BSTNode target){
		return null;
	}

	/**
	 * 
	 * @param target
	 */
	public Comparable successor(Comparable target){
		return null;
	}

}
