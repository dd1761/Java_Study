package array;

import java.util.Scanner;

public class Array03 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int size;
		int[] ar;
		int sum = 0;
		
		System.out.print("배열의 크기를 입력해주세요 : ");
		size = scanner.nextInt();

		ar = new int[size];
		for(int i = 0; i < size; i++) {
			System.out.print("ar[" + i + "] 입력 : ");
			ar[i]= scanner.nextInt();
			sum = sum + ar[i];
		
			
		}
		System.out.println();
		
		int max = ar[0];	//배열의 첫번째 데이터를 초기값으로 잡는다.
		int min = ar[0];
		
		for(int i = 1; i < ar.length; i++) {
			if(ar[i] > max) {
				max = ar[i];
			}
		}
		for(int i = 1; i < ar.length; i++) {
			if(ar[i] < min){
				min = ar[i];
			}
		}
		
		
		for(int data : ar) {
			System.out.print(data + " ");

			
		}
		System.out.println("합계 : " + sum);
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
	}

}



/*


[문제] 베열의 크기를 입력받아서 배열을 생성한다.
데이터를 출력하고 합, 최대값, 최소값을 구해라




*/