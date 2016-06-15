package org.fmz.container;


public abstract class LinkedContainer extends Container {

	protected abstract class Node {

		public Object data;

		public Node(){

		}

		public void finalize() throws Throwable {

		}

		/**
		 * 
		 * @param dat
		 */
		public int Node(Object dat){
			return 0;
		}

	}

	public LinkedContainer(){

	}

	public void finalize() throws Throwable {
		super.finalize();
	}

}
