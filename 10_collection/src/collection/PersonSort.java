package collection;

import java.util.Arrays;

public class PersonSort {
	
	public static void main(String[] args) {
		String[] ar = {"orange", "apple", "banana", "pear", "peach", "applemango"};
		
		System.out.print("정렬 전 = ");
		for(String data : ar) {
			System.out.print(data + "  ");
		}
		System.out.println();
		
		Arrays.sort(ar);	// 오름차순 정렬
		
		System.out.print("정렬 후 = ");
		for(String data : ar) {
			System.out.print(data + "  ");
		}
		System.out.println();
	}
	
}









