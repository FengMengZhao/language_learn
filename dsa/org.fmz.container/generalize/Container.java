package org.fmz.container;


public abstract class Container {

	protected int numItems;

	public Container(){

	}

	public void finalize() throws Throwable {

	}

	public abstract void clear();

	public boolean isEmpty(){
		return numItems == 0 ;
	}

	public int size(){
		return numItems ;
	}

}