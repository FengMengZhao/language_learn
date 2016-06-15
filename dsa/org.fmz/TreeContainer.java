package org.fmz.container;


public abstract class TreeContainer extends LinkedContainer {

	protected Node root;

	public TreeContainer(){

	}

	public void finalize() throws Throwable {
		super.finalize();
	}

	public void clear(){

	}

}
