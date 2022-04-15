package Merge_two_sorted_without_extraSPACE;

import java.util.ArrayList;
import java.util.List;

public class final_method {
	public static void main(String[] args) {
		int n=4,m=3;
		int[] a= new int[] {1,4,8,10};
		int[] b= new int[] {2,3,9};
		
		List<Integer> al = new ArrayList<Integer>();
		for(int i=0,j=0;i<n,j<m;i++,j++) {
			al.add(a[i]);
			al.add(b[j]);
		}
	}
}
