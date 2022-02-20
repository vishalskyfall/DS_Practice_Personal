package test;

public class modulo_Arithmetic {
	public static void main(String[] args) {
		System.out.println(fetch_power(7, 4, 1));
	}
	static long fetch_power(long a,long b,int n) {
		long res=1;
		while(b>0) {
			if((b&1)!=0) {
				res = (res%n * a%n)%n;
				
			}
			a=(a%n *a%n)%n;
			b=b/2;
		}
		return res;
	}
	
}
