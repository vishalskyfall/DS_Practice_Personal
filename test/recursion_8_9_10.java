package test;

//basic recursion we already know i guess
//josephus and n x m matrix
public class recursion_8_9_10 {

	public static void main(String[] args) {
		// System.out.println(matrix_only_right_down(3, 2));
		// System.out.println("Winner of death match : "+josephus(5,3));
		// String s = "lolaalol";
		// System.out.println(s+" is palin ? : " + palindrome(s, 0, s.length()-1));
		String s = "ab";
		String current = " ";
		// subsequence_of_str(s, 0, current);
		all_subsets(s,0,s.length()-1);
	}

	//swap
	static String swap(String s,int i,int j) {
		char ch[] = s.toCharArray();
		char t = ch[i];
		ch[i] = ch[j];
		ch[j] = t;
		return String.valueOf(ch);
	}
	// ab : ab & ba
	static void all_subsets(String s, int l, int r) {
			if ( l==r) System.out.println(s);
					//return;
			
			for(int i=l;i<=r;i++) {
				s=swap(s,l,i);
				all_subsets(s,l+1,r);
				s=swap(s,l,i);
			}
	}

	static void subsequence_of_str(String s, int i, String cur) {
		if (i == s.length()) {
			System.out.println(cur);
			return;
		}

		subsequence_of_str(s, i + 1, cur + s.charAt(i));
		subsequence_of_str(s, i + 1, cur);
	}

	// recursion of strings
	static boolean palindrome(String s, int l, int r) {
		// r = last char and l= first char
		if (l >= 4) {
			return true;
		}
		if (s.charAt(l) != s.charAt(r))
			return false;

		return palindrome(s, l + 1, r - 1);
	}

	// round table of death 9th video must check
	static int josephus(int n, int k) {
		if (n == 1)
			return 0;

		return (josephus(n - 1, k) + k) % n;
	}

	// n x m matrix
	static int matrix_only_right_down(int n, int m) {
		if (n == 1 || m == 1) {
			return 1;
		}
		return matrix_only_right_down(n - 1, m) + matrix_only_right_down(n, m - 1);
	}
}
