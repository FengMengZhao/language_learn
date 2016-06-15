package org.fmz.container;


public class Queue extends LinearLinkedContainer {

	public class DLNode extends SLNode {

		DLNode prev;

		public DLNode(){

		}

		public void finalize() throws Throwable {
			super.finalize();
		}

		/**
		 * 
		 * @param dat
		 */
		public DLNode(Object dat){

		}

		/**
		 * 
		 * @param dat
		 * @param pre
		 * @param nxt
		 */
		public DLNode(Object dat, DLNode pre, DLNode nxt){

		}

	}

	DLNode head;
	DLNode tail;

	public Queue(){

	}

	public void finalize() throws Throwable {
		super.finalize();
	}

	public Object front(){
		return null;
	}

	/**
	 * 
	 * @param element
	 */
	public void insertBack(Object element){

	}

	public Object removeFront(){
		return null;
	}

}
