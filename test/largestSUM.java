package test;

public class largestSUM {
public static void main(String[] args) {
	int[] a = new int[] {1,6,34,6,2,4,8,9};
	int sum = maxSubArray(a);
	System.out.println(sum);
}
static int maxSubArray(int a[]) {
	int maxsum=0;
	int currentSum=0;
	for(int i=0;i<a.length;i++) {
		currentSum +=a[i];
		if(currentSum > maxsum) {
			maxsum = currentSum;
		}
		if(currentSum < 0) {
			currentSum=0;
		}
	}
	return maxsum;
	
}
}
