package test;

import java.util.Arrays;

public class prime {
	public static void main(String[] args) {
		int sum=0;
		boolean p[] = prime2(10);
		for (int i = 0; i < p.length; i++) {
			if (p[i] == true) {
				sum++;
				//System.out.println(p[i]+" " +i);
			}
		}
		System.out.println(" Total Primes :"+sum);
	}

	static boolean[] prime2(int n) {
		boolean isprime[] = new boolean[n + 1];
		Arrays.fill(isprime, true);
		isprime[0] = false;
		isprime[1] = false;
		for (int i = 2; i <= n; i++) {
			for (int j = 2*i; j <= n; j += i) {
				isprime[j] = false;
			}
		}

		return isprime;
	}
}
