package array;

import java.util.Scanner;

public class BaseBall {

	public static void main(String[] args) {
		int[] com = new int[3];
		int[] user = new int[3];
		Scanner scanner = new Scanner(System.in);

		int number;
		int ballstack = 0;
		int strikestack = 0;
		String play;

		for (int i = 0; i < com.length; i++) {
			com[i] = (int) (Math.random() * 9 + 1);

			// 중복체크
			for (int j = 0; j < i; j++) {	//컴퓨터 랜덤값 중복체크
				if (com[i] == com[j]) {
					i--;
					break;
				}
			}
		}

//		int temp;
//		for (int i = 0; i < com.length - 1; i++) {
//			for (int j = i + 1; j < com.length; j++) {
//				if (com[i] > com[j]) { // > 오름차순, < 내림차순
//					temp = com[i];
//					com[i] = com[j];
//					com[j] = temp;
//
//				}
//			}
//		}

//		for (int data : com) {
//			System.out.print(String.format("%3d", data));	//정답확인
//		}

		
	loop: while (true) {
			System.out.print("게임을 실행하시겠습니까(Y/N) ");
			play = scanner.next();
			
			if (play.equals("Y") || play.equals("y")) {
				System.out.println("게임을 시작합니다.");
				while (true) {
					System.out.println();
					ballstack = 0;
					strikestack = 0;
					
					System.out.print("숫자 입력 : ");
					number = scanner.nextInt();

					for (int i = com.length - 1; i >= 0; i--) {
						user[i] = number % 10;				
						number = number / 10;
						for (int j = 0; j < com.length; j++) {
							if (user[i] == com[j]) {
								ballstack++;
							}
						}
						if (user[i] == com[i]) {
							strikestack++;
							ballstack--;
						}

					}
					System.out.print(strikestack + "스트라이크 " + ballstack + "볼");
					System.out.println();
					
					if (strikestack == 3) {
						System.out.println("프로그램을 종료합니다.");
						 break loop;	
					}

				}

			} else if (play.equals("N") || play.equals("n")) {
				System.out.println("게임을 종료합니다.");
				break;
			} else {
				continue;
			}
		}

	}
}

/*
 * [문제] 야구게임 크기가 3개인 정수형 배열을 잡고 1~9사이의 난수를 발생한다 발생한 숫자를 맞추는 게임 중복은 제거한다
 * 
 * [실행결과] 게임을 실행하시겠습니까(Y/N) : w 게임을 실행하시겠습니까(Y/N) : u 게임을 실행하시겠습니까(Y/N) : y
 * 
 * 게임을 시작합니다
 * 
 * 숫자입력 : 123 0스트라이크 0볼
 * 
 * 숫자입력 : 567 0스트라이크 2볼
 * 
 * 숫자입력 : 758 1스트라이크 2볼 ...
 * 
 * 숫자입력 : 785 3스트라이크 0볼
 * 
 * 프로그램을 종료합니다. 123
 */