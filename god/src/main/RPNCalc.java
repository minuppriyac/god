package main;

import java.util.LinkedList;

public class RPNCalc {

	public int calculate(String expression) {
		// TODO Auto-generated method stub
		
		LinkedList<Integer> stack = new LinkedList<Integer>();
		
		String value;
		int result = 0;
		for(String token:expression.split("\\s")) {
			
			if(isNumber(token)) {
				stack.push(Integer.parseInt(token));
			} else if(token.equals("+")) {
				int val2 = stack.pop();
				int val1 = stack.pop();
				result = val1 + val2;
				stack.push(result);
			} else if(token.equals("-")) {
				int val2 = stack.pop();
				int val1 = stack.pop();
				result = val1 - val2;
				stack.push(result);
			} else if(token.equals("*")) {
				int val2 = stack.pop();
				int val1 = stack.pop();
				result = val1 * val2;
				stack.push(result);
			} else if(token.equals("/")) {
				int val2 = stack.pop();
				int val1 = stack.pop();
				result = val1 / val2;
				stack.push(result);
			} else if(token.equals("^")) {
				int val2 = stack.pop();
				int val1 = stack.pop();
				result = (int) Math.pow(val1, val2);
				stack.push(result);
			}
		}
		
		System.out.println(stack.pop());
		return result;
	}
	
	
	private boolean isNumber(String value) {
		try {
			int intVal = Integer.parseInt(value);
			return true;
		}catch(Exception e) {
			return false;
		}
	}
	
	private boolean isOperator(String value) {
		return (value.equals("+") || value.equals("-") || value.equals("*") || value.equals("/"));
	}
	
	
	

}
