package test;

import java.util.HashSet;
import java.util.Set;

public class HASH {
	public  static void main(String[] args) {
		int[] a = new int[] {1,6,34,6,2,4,8,9};// 8 are here hash will skip repeat
		int[] b = new int[] {1,6,35};//3
		Set<Integer> s = new HashSet<>();
		for(int element:a) {
			s.add(element);
		}
		int count=0;
		for(int element:b) {
			if(s.contains(element)) {
				count++;
				s.remove(element);
			}
			s.add(element);
		}
		//intersection
		System.out.println(count); 
		
	}
	
	//distinct elements
	
}
