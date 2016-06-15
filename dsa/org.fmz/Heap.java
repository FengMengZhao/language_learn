package org.fmz.container;


public abstract class Heap extends ArrayContainer {

	protected Comparable[] data;



	public void finalize() throws Throwable {
		super.finalize();
	}

	public Heap(){

	}

	/**
	 * 
	 * @param initCapacity
	 */
	public Heap(int initCapacity){

	}

	public int capacity(){
		return 0;
	}

	public void clear(){

	}

	public void contract(){

	}

	/**
	 * 
	 * @param element
	 */
	public void insert(Comparable element){

	}

	/**
	 * 
	 * @param pos
	 */
	protected boolean isLeaf(int pos){
		return false;
	}

	/**
	 * 
	 * @param pos
	 */
	protected int leftChild(int pos){
		return 0;
	}

	/**
	 * 
	 * @param pos
	 */
	protected int parent(int pos){
		return 0;
	}

	protected Comparable peek(){
		return null;
	}

	protected abstract void percolate();

	protected Comparable remove(){
		return null;
	}

	/**
	 * 
	 * @param pos
	 */
	protected int rightChild(int pos){
		return 0;
	}

	protected abstract void sift();

	public int size(){
		return 0;
	}

	/**
	 * 
	 * @param arr
	 * @param first
	 * @param second
	 */
	protected void swap(Comparable[] arr, int first, int second){

	}

}
