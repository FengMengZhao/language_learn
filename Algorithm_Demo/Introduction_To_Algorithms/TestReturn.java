package org.fmz.algorithm ;

public class TestReturn{

	public static void number(int i){
		i = 10 ;
	}
	/*
	public static int number(int i){
		i = 10 ;
		return i ;
	}
	*/
	public static void main(String args[]){
		int i = 5 ;
		number(i) ;
		System.out.println(i) ;
	}
}