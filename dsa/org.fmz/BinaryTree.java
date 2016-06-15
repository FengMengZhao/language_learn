package org.fmz.container;


public abstract class BinaryTree extends TreeContainer {

	public abstract class BinaryTreeNode extends Node {

		public BinaryTreeNode leftChild;
		public BinaryTreeNode parent;
		public BinaryTreeNode rightChild;

		public BinaryTreeNode(){

		}

		public void finalize() throws Throwable {
			super.finalize();
		}

		/**
		 * 
		 * @param dat
		 * @param lc
		 * @param rc
		 * @param par
		 */
		public BinaryTreeNode(Object dat, BinaryTreeNode lc, BinaryTreeNode rc, BinaryTreeNode par){

		}

		/**
		 * 
		 * @param dat
		 */
		public BinaryTreeNode(Object dat){

		}

		public boolean isLeaf(){
			return false;
		}

	}

	public interface NodeProcessor {

		/**
		 * 
		 * @param node
		 */
		void processNode(BinaryTreeNode node);

	}

	public BinaryTree(){

	}

	public void finalize() throws Throwable {
		super.finalize();
	}

	public int height(){
		return 0;
	}

	/**
	 * 
	 * @param current
	 * @param ht
	 */
	protected int heightHelper(BinaryTreeNode current, int ht){
		return 0;
	}

	/**
	 * 
	 * @param node
	 * @param processor
	 */
	protected void inorder(BinaryTreeNode node, NodeProcessor processor){

	}

	/**
	 * 
	 * @param processor
	 */
	public void inorderTraverse(NodeProcessor processor){

	}

	/**
	 * 
	 * @param node
	 * @param processor
	 */
	protected void postorder(BinaryTreeNode node, NodeProcessor processor){

	}

	/**
	 * 
	 * @param processor
	 */
	public void postorderTraverse(NodeProcessor processor){

	}

	/**
	 * 
	 * @param node
	 * @param processor
	 */
	protected void preorder(BinaryTreeNode node, NodeProcessor processor){

	}

	/**
	 * 
	 * @param node
	 * @param processor
	 */
	public void preorderTraverse(BinaryTreeNode node, NodeProcessor processor){

	}

}
