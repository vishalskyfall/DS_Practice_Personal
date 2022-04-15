package binarySearch_Search_In_Rotated_SortedArray;

public class final_method {
	public static void main(String args[]) {
		int arr[] = { 10, 20, 30, 40, 50 ,9,363,548,77,932};
		int item = 932;
		int last = arr.length - 1;
		binarySearch(arr, 0, last, item);
	}

	static void binarySearch(int[] a, int first, int last, int item) {
		int mid = (first+last)/2;
		while(first<=last) {
//			System.out.println(mid+"1");
			if(a[mid]<item) {
				first = mid+1;
			}
			else if(a[mid]==item) {
				System.out.println("Found at:"+(+mid+1));  //simple "+ mid+1 will print as mid value + 1 as string
						///////////////////////////////////////// so use () and (mid+1) so they will be as int
				break;
			}
			else {
				last=mid-1;
			}
			mid = (first+last)/2;
//			System.out.println(mid);
		}
		if(first>last) {
			System.out.println("Not found");
		}
	}
}
