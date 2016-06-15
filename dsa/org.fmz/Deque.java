package org.fmz.container;


public class Deque extends Queue {

	public Deque(){

	}

	public void finalize() throws Throwable {
		super.finalize();
	}

	public Object back(){
		return null;
	}

	/**
	 * 
	 * @param element
	 */
	public void insertFront(Object element){

	}

	public Object removeback(){
		return null;
	}

}
