import java.util.* ;

public class ReversePolishNotation{

	public static List<String> infixToPostfix(char[] infix_expr){
		Stack<Character> operator_stack = new Stack<Character>() ;
		List<String> postfix = new ArrayList<String>() ;
		operator_stack.push('(') ;

		for(int i=0; i<infix_expr.length; i++){
			if(Character.isDigit(infix_expr[i])){
				String read_num = "" + infix_expr[i] ; 			
				int j = i ;
				while(Character.isDigit(infix_expr[++j])){
					read_num = read_num + infix_expr[j] ;
				}
				i = j - 1 ;
				postfix.add(read_num) ;
			}else{
				if(Character.compare(infix_expr[i], '(') == 0)
					operator_stack.push('(') ;
				else if(Character.compare(infix_expr[i], ')') == 0){
					while(!operator_stack.peek().equals('(')){
						postfix.add("" + operator_stack.pop()) ;
					}
					operator_stack.pop() ;
				}else{
					if(InfixExpressionEvaluate.compare(infix_expr[i], operator_stack.peek()) == 1){
						operator_stack.push(infix_expr[i]) ;
					}else{
						if(InfixExpressionEvaluate.compare(infix_expr[i], operator_stack.peek()) == -1){
							postfix.add("" + operator_stack.pop()) ;
							i -- ;
						}
					}
				}
			}
		}
		return postfix ;
	}


	public static int evaluate(String[] postfix){
		Stack<Integer> compute = new Stack<Integer>() ;
		for(int i=0; i<postfix.length; i++){
			if(isDigit(postfix[i])){
				compute.push(Integer.parseInt(postfix[i])) ;
			}else{
				switch(postfix[i]){
					case "!":
						int fac = compute.pop() ;
						compute.push(InfixExpressionEvaluate.factorial(fac)) ; 
						break ;
					default:  
						int first = compute.pop() ;
						int following = compute.pop() ;
						compute.push(InfixExpressionEvaluate.operate(postfix[i].toCharArray()[0], first, following)) ;
				}
			}
		}			
		return compute.pop() ;
	}

	public static boolean isDigit(String s){
		try{
			Integer.parseInt(s) ;
			return true ;
		}catch(Exception e){
			return false ;
		}
	}
	

	public static void main(String args[]){
		String infix_expression = "(1+2^3!-4)*(5!-(6-(7-(89-0!))))" ;
		char[] infix_char = infix_expression.concat(")").toCharArray() ;
		List<String> postfix = infixToPostfix(infix_char) ;
		System.out.println(postfix) ;

		String[] str = new String[postfix.size()] ;
		Iterator<String> iter = postfix.iterator() ;
		int i = 0 ;
		while(iter.hasNext()){
			str[i++] = iter.next() ;	
		}	
		System.out.println(evaluate(str)) ;
	}
}/* output:
[1, 2, 3, !, ^, +, 4, -, 5, !, 6, 7, 89, 0, !, -, -, -, -, *]
2013
[Finished in 0.7s]
*/