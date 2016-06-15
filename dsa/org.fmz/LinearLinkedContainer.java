package org.fmz.container;


public abstract class LinearLinkedContainer extends LinkedContainer {

	public class SLNode extends Node {

		public Object data;
		public SLNode next;

		public SLNode(){

		}

		public void finalize() throws Throwable {
			super.finalize();
		}

		/**
		 * 
		 * @param dat
		 */
		public SLNode(Object dat){

		}

		/**
		 * 
		 * @param dat
		 * @param nxt
		 */
		public SLNode(Object dat, SLNode nxt){

		}

	}

	protected SLNode head;

	public LinearLinkedContainer(){

	}

	public void finalize() throws Throwable {
		super.finalize();
	}

	public void clear(){

	}

}
