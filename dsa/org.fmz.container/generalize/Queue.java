package org.fmz.container;

public class Queue extends LinearLinkedContainer{ 

	protected static class DLNode extends SLNode{

		DLNode prev ;

		public DLNode(Object dat){
			super(dat) ;
		}

		public DLNode(Object dat, DLNode pre, DLNode nxt){
			super(dat, nxt) ;
			prev = pre ;
		}
	}

	DLNode head ;
	DLNode tail ;

	public Queue(){

	}

	public void finalize() throws Throwable {
		super.finalize();
	}

	public void clear(){
		head = tail = null ;
	}

	public Object front(){
		if(isEmpty())
			return null;
		return head.data ;
	}

	/**
	 * 
	 * @param element
	 */
	public void insertBack(Object element){
		if(isEmpty()){
			head = tail = new DLNode(element) ;
			numItems ++ ;
			return ;
		}
		tail.next = new DLNode(element) ;
		tail = (DLNode)tail.next ;
		numItems ++ ;
	}

	public Object removeFront(){
		Object tmp = front() ;
		if(tmp == null)
			return null;
		head = (DLNode)head.next ;
		if(head != null)
			((DLNode)head).prev = null ;
		else
			tail = null ;
		numItems -- ;
		return tmp ;
	}

}