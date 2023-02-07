package array;

public class BaseBall {

	public static void main(String[] args) {
		int[] com = new int[3];
		int[] user = new int[3];
		
		for (int i = 0; i < com.length; i++) {
			com[i] = (int) (Math.random() * 9 + 1);

			// 중복체크
			for (int j = 0; j < i; j++) {
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

		for (int data : com) {
			System.out.print(String.format("%5d", data));

		}
	}

}














/*
[문제] 야구게임
크기가 3개인 정수형 배열을 잡고 1~9사이의 난수를 발생한다
발생한 숫자를 맞추는 게임
중복은 제거한다

[실행결과]
게임을 실행하시겠습니까(Y/N) : w
게임을 실행하시겠습니까(Y/N) : u
게임을 실행하시겠습니까(Y/N) : y

게임을 시작합니다

숫자입력 : 123
0스트라이크 0볼

숫자입력 : 567
0스트라이크 2볼

숫자입력 : 758
1스트라이크 2볼
...

숫자입력 : 785
3스트라이크 0볼

프로그램을 종료합니다.

*/