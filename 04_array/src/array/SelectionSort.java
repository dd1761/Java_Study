package array;

public class SelectionSort {

	public static void main(String[] args) {
		int[] ar = { 25, 40, 32, 78, 56 };

		// 출력
		

		// 정렬
		// 오름차순(ASCENDING)
		// 내림차순(DECENDING)

		for (int i = 0; i < ar.length - 1; i++) {
			for (int j = i + 1; j < ar.length; j++) {
				if(ar[i] > ar[j]) {
					int temp;
					temp = ar[i];
					ar[i] = ar[j];
					ar[j] = temp;
					
				}
				
			}
		}
		for (int i = 0; i < ar.length; i++) {
			System.out.print(String.format("%4d", ar[i]));
		}
		System.out.println();

	}

}
