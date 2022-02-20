package test;

public class stocksPART1 {
public static void main(String[] args) {
	int[] a = new int[] {1,6,34,6,2,4,8,9};
	int sum = stocks(a);
	System.out.println(sum);
}
static int stocks(int a[]) {
	int maxProf=0;
	int minProf=a[0];
	for(int i=0;i<a.length;i++) {
		minProf = Math.min(maxProf, a[i]);
		int p =a[i]-minProf;
		maxProf = Math.max(maxProf, p);
	}
	
	return maxProf;
}
}
