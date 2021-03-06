/**
 * Purpose: Checking if parentheses in an equation is balanced or not.
 * 
 * @author Kumar Shubham
 * 
 * @since 02-04-2018
 *
 */

package com.bridgeit.programs;

import com.bridgeit.utility.Utility;

public class BalancedParentheses {
	public static void main(String[] args) {
		Utility utility = new Utility();
		String input = utility.inputString();
		char[] c = input.toCharArray();
		Stack<Character> stack = new Stack<Character>(c.length);
		for(int i=0;i<c.length;i++) {
			if(c[i]=='(') {
				stack.push(c[i]);
			}
			else if(c[i]==')') {
				stack.pop();
			}else if(c[i]=='{') {
				stack.push(c[i]);
			}else if(c[i]=='}') {
				stack.pop();
			}
			else if(c[i]=='[') {
				stack.push(c[i]);
			}
			else if(c[i]==']') {
				stack.pop();
			}
		}
		boolean b = stack.isEmpty();
		
		if(b) {
			System.out.println("Parentheses are Balanced");
		}
		else {
			System.out.println("Parentheses are Not Balanced");
		}
	}
}
