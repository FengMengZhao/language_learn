package org.fmz.container;


public abstract class LinkedContainer extends Container {

	/*
	Any  linked container is composed of nodes, but the perticular form of the nodes depends on the type of container.
	Classes SLNode and DLNode is suitable for linear linked container, for exapmple, but not for, say, linked binary-tree container,
	because a binary-tree node typically has links to its parent, its left child, and its right child.
	Thus class LinkedContainer provides a member class called Node, an instance of which has only a data portion.
	The links appropriate for a specific kind of linked container can be obtained by subclassing Node.
	*/
	protected static abstract class Node{
		public Object data ;
		public Node(Object dat){
			data = dat ;
		}
	}

}