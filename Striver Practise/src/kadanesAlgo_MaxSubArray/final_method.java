package kadanesAlgo_MaxSubArray;

public class final_method {
	public static void main(String[] args) {
		int[] a = new int[] {-2,1,-3,4,-1,2,1,-5,4};
		int sum = max(a);
		System.out.println(sum);
	}

	static int max(int[] a) {
		int maxsum = Integer.MIN_VALUE;
		int current = 0;
		if (a.length == 1 && a[0] < 0) {
			return -1;
		}
		for (int i = 0; i < a.length; i++) {
			current += a[i];
			if (current > maxsum) {
				maxsum = current;
			}
			if (current < 0) {
				current = 0;
			}
		}

		return maxsum;
	}
}
