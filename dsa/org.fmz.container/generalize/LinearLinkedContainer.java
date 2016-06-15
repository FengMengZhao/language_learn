package org.fmz.container;

public abstract class LinearLinkedContainer extends LinkedContainer {

	protected static class SLNode extends Node{
		public SLNode next ;
		public SLNode(Object dat){
			super(dat) ;
		}
		public SLNode(Object dat, SLNode nex){
			super(dat) ;
			next = nex ;
		}
	}

	protected SLNode head;


	public void finalize() throws Throwable {
		super.finalize();
	}

	public void clear(){
		head = null ;
	}

}