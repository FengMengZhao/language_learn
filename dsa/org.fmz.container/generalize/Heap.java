package org.fmz.container;


public abstract class Heap extends ArrayContainer {

	/*
	* To shadow a super field is to declare a field of the same name in a subclass
	* Methods of the subclass use that name to access the new field, not the shadowed superclass field.
	* The shadow field is still present, but it must be access by prepending super to its name.
	*/
	protected Comparable[] data; // This array shadows the superclass field



	public void finalize() throws Throwable {
		super.finalize();
	}

	public Heap(){
		/* The 'data' array of ArrayContainer is being shadowed
		 * precisely because it is not needed here
		 * Thus it should be reclaimed by the garbage collector
		 */
		super.data = null ;
		data = new Comparable[DEFAULT_CAPACITY] ;
	}

	/**
	 * 
	 * @param initCapacity
	 */
	public Heap(int initCapacity){
		super.data = null ; //for the same reason above
		if(initCapacity <= 0)
			data = new Comparable[DEFAULT_CAPACITY] ;
		else
			data = new Comparable[initCapacity] ;
	}

	public int capacity(){
		return data.length ; // The method must be overridden, according the same reason for the method clear() below
	}

	/*
	 * The clear() method of the class ArrayContainer must be overridden here
	 * because the superclass method deals with the shadowed array, not the array of Comparable
	 */
	public void clear(){
		for(int i=0; i<numItems; i++)
			data[i] = null ;
		numItems = 0 ;
	}

	public void contract(){
		if(numItems == capacity())
			return ;
		Comparable[] new_data = new Comparable[numItems] ;
		for(int i=0; i<numItems; i++)
			new_data[i] = data[i] ;
		data = new_data ;
	}

	/**
	 * 
	 * @param element
	 */
	public void insert(Comparable element){
		if(isFull()){
			Comparable[] new_data = new Comparable[numItems << 1] ;
			for(int i=0; i<numItems; i++)
				new_data[i] = data[i] ;
			data = new_data ;
		}
		data[numItems++] = element ;
		percolate() ;
	}

	/**
	 * 
	 * @param pos
	 */
	protected boolean isLeaf(int pos){
		return (pos << 1) + 1 >= numItems ;
	}

	/**
	 * 
	 * @param pos
	 */
	protected int leftChild(int pos){
		if(pos < 0)
			return -1;
		return (pos << 1) + 1 ;
	}

	/**
	 * 
	 * @param pos
	 */
	protected int parent(int pos){
		if(pos <= 0)
			return -1 ;
		return (pos - 1) >> 1 ;
	}

	protected Comparable peek(){
		if(isEmpty())
			return null ;
		return data[0] ;
	}

	protected abstract void percolate();

	protected Comparable remove(){
		if(isEmpty())
			return null ;
		Comparable root = data[0] ;
		swap(data, 0, numItems-1) ;
		data[--numItems] = null ;
		if(numItems > 0)
			sift() ;
		return root ;
	}

	/**
	 * 
	 * @param pos
	 */
	protected int rightChild(int pos){
		if(pos < 0)
			return -1;
		return (pos << 1) + 2 ;
	}

	protected abstract void sift();

	/**
	 * 
	 * @param arr
	 * @param first
	 * @param second
	 */
	protected void swap(Comparable[] arr, int first, int second){
		Comparable tmp = arr[first] ;
		arr[first] = arr[second] ;
		arr[second] = tmp ;
	}

	public int size(){
		return numItems;
	}

}