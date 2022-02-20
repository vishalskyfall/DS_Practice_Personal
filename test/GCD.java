package test;

public class GCD {

	public static void main(String[] args) {
		System.out.println(gcd(29,27));
	}
	static int gcd(int a, int b) {
		return b==0 ?  a :  gcd(b,a%b);
	}
}
