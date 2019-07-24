package pie;

import java.util.Stack;

public class par {
	public static void main(String[] args) {
		Stack<Integer> cStack = new Stack<>();
		Stack<Integer> bStack = new Stack<>();
		Stack<Integer> pStack = new Stack<>();
		cStack.add(1);
		bStack.add(1);
		pStack.add(1);
		String token = "";
		for (int i = 0; i < token.length(); i++) {
			if (token.charAt(i) == '{') {
				cStack.push(1);
			}
			if (token.charAt(i) == '}') {
				cStack.pop();
			}
			if (token.charAt(i) == '(') {
				pStack.push(1);
			}
			if (token.charAt(i) == ')') {
				pStack.pop();
			}
			if (token.charAt(i) == '[') {
				bStack.push(1);
			}
			if (token.charAt(i) == ']') {
				bStack.pop();
			}
		}
		if(bStack.size()-1 == 0 && pStack.size()-1 == 0 && cStack.size()-1 == 0)
		{
			System.out.println("Valid");
		}
		else
		{
			System.out.println("not valid");
		}

	}

}
