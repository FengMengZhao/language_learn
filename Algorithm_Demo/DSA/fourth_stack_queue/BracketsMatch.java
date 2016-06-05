//package test ;

import java.util.* ;

public class BracketsMatch{

	public static boolean bracketsMatch(String str){
		char[] char_ary = str.toCharArray() ;
		Stack<Character> sta = new Stack<Character>() ; 

		for(int i=0; i<char_ary.length; i++){
			char c = char_ary[i] ;
			try{
				switch(c){
					case '(': sta.push('(') ;
						break ;
					case '[': sta.push('[') ;
						break ;
					case '{': sta.push('{') ;
						break ;
					case '<': sta.push('<') ;
						break ;
					case ')':
						if(sta.peek().equals('(')){
							sta.pop() ;
							break ;
						}else
							return false ;
					case ']':
						if(sta.peek().equals('[')){
							sta.pop() ;
							break ;
						}else
							return false ;
					case '}':
						if(sta.peek().equals('{')){
							sta.pop() ;
							break ;
						}else
							return false ;
					case '>':
						if(sta.peek().equals('<')){
							sta.pop() ;
							break ;
						}else
							return false ;
				}
 			}catch(EmptyStackException ese){
 				return false ;
			}
		}
		return sta.empty() ;
	}
	public static void main(String args[]){
		String str = "{()[][()][]}" ;
		//String str = "[(])" ;
		boolean result = bracketsMatch(str) ;
		System.out.println(result) ;
	}
}