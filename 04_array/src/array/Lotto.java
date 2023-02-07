package array;

import java.util.Scanner;

public class Lotto {

	public static void main(String[] args) {
		int[] lotto;
		lotto = new int[6];
		Scanner scanner = new Scanner(System.in);

		System.out.print("현금 입력 : ");
		int money = scanner.nextInt();
		
		for (int k = 1; k <= (money / 1000); k++) {
//		for(int i = 1; i <= number; i++) 
			for (int i = 0; i < lotto.length; i++) {
				lotto[i] = (int) (Math.random() * 45 + 1);

				// 중복체크
				for (int j = 0; j < i; j++) {
					if (lotto[i] == lotto[j]) {
						i--;
						break;
					}
				}
			}
			int temp;
			for (int i = 0; i < lotto.length - 1; i++) {
				for (int j = i + 1; j < lotto.length; j++) {
					if (lotto[i] > lotto[j]) { // > 오름차순, < 내림차순
						temp = lotto[i];
						lotto[i] = lotto[j];
						lotto[j] = temp;

					}
				}
			}

			for (int data : lotto) {
				System.out.print(String.format("%5d", data));

			}
			System.out.println();
			if (k % 5 == 0) {
				System.out.println();
			}
		}

	}

}

//System.out.print(lotto[i] + " ");
//for(int j = lotto.length - 1; j >= 0; j--) {
//	if(lotto[i] == lotto[j]) {
//		lotto[i] = (int) (Math.random() * 45 + 1);
//	}
//}System.out.print(lotto[i] + "\t");
//
//for(int j =0; j < lotto.length-1; j++ ) {
//	if(lotto[i] == lotto[j+1]) {		
//		lotto[i] = (int) (Math.random() * 45 + 1);
//		
//	}
//	
//}
// System.out.print(lotto[i] + "\t");

/*
 * [문제] 로또 - 자동
 * 
 * 
 * 
 * 
 * 1000원당 1줄 5천원이면 5줄 생성
 */