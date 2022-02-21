package test;

import java.util.Stack;

public class parenthesis_Matching {
	public static void main(String[] args) {

		String s = "{()}";
		int c = 0;
		Stack<Character> s1 = new Stack<>();
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '{' || s.charAt(i) == '[' || s.charAt(i) == '(') {
				s1.push(s.charAt(i));
				// System.out.println(s1.size());
			}

			else {
				if (s1.isEmpty()) {

					break;
				} else if (ismatching(s.charAt(i), s1.peek())) {
					c++;
					System.out.println("False");

				}

				else {
					s1.pop();
				}

			}
		}
		if (c == 0) {
			System.out.println(s1.isEmpty());
		}

	}

	static boolean ismatching(char a, char b) {
		if (a == '{' && b == '}' || a == '[' && b == ']' || a == '(' && b == ')') {
			return false;
		}

		return true;
	}
}
