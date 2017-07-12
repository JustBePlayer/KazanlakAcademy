package sap.kazanlak.academy.datastructures.stack;

import java.util.Stack;

public class ReversePolishNotation {
	public static void main(String[] args) {
		String input = "42 2 / 4 2 - *";
		System.out.println(calculateExpression(input));
	}
	
	private static double calculateExpression(String expression){
		String[] tokens = expression.split(" ");
		Stack<Double> operands = new Stack<>();
		
		for(String token : tokens){
			if(isNumeric(token)){
				operands.push(Double.parseDouble(token));
			} else if(isOperator(token)){
				applyOperation(token, operands);
			}
		}
		return operands.pop();
	}
	
	private static void applyOperation(String operation, Stack<Double> operands){
		double secondOperand = operands.pop();
		double firstOperand = operands.pop();
		
		if(operation.equals("+")){
			operands.push(firstOperand + secondOperand);
		} else if(operation.equals("-")){
			operands.push(firstOperand - secondOperand);
		} else if(operation.equals("*")){
			operands.push(firstOperand * secondOperand);
		} else if(operation.equals("/")){
			operands.push(firstOperand / secondOperand);
		}
	}
	
	private static boolean isNumeric(String arg){
		try{
			Double.parseDouble(arg);
		} catch (NumberFormatException e) {
			return false;
		}
		return true;
	}
	
	private static boolean isOperator(String token){
		return token.equals("*") ||
			   token.equals("+") ||
			   token.equals("-") ||
			   token.equals("/");
	}
}
