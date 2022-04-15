package permutations_STRING;

import java.util.HashSet;
import java.util.Set;

public class final_method {
	public static void main(String[] args) {
		String ss = "ab";
		System.out.println(getPermData(ss));
	}

	static Set<String> getPermData(String s) {
		Set<String> p = new HashSet<String>();
		// checking null
		if (s == null) {
			return null;
		} else if (s.length() == 0) {
			p.add("");
			return p;
		}
		char first = s.charAt(0);
		String remaining = s.substring(1);
//		System.out.println(remaining+" r & f "+first);

		Set<String> word = getPermData(remaining); // send remaining again
		
		for (String newStr : word) {
			for (int i = 0; i <= newStr.length(); i++) {
				System.out.println(newStr.substring(0, i) +" <"+ first +"> "+ newStr.substring(i));
				p.add(newStr.substring(0, i) + first + newStr.substring(i));
			}
		}

		return p;
	}
}
