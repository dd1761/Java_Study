package array;

import java.util.Scanner;

public class baseballtrain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] com = new int[3];
		int[] user = new int[3];

		String yn;

		do {
			System.out.print("게임을 실행하시겠습니까(Y/N) : ");
			yn = sc.next();

		} while (!yn.equals("Y") && !yn.equals("y") && !yn.equals("N") && !yn.equals("n"));
		
		if (yn.equals("Y") || yn.equals("y")) {
			System.out.println("게임을 시작합니다");

			// 컴퓨터 난수 발생
			for (int i = 0; i < com.length; i++) {
				com[0] = (int) (Math.random() * 9 + 1);

				// 중복제거
				for (int j = 0; j < i; j++) {
					if (com[i] == com[j]) {
						i--;
						break;
					}
				}
			}
			System.out.println(com[0] + ", " + com[1] + ", " + com[2]);

			while(true) {
				System.out.println();
				System.out.print("숫자 입력 : ");
				int num = sc.nextInt();

				user[0] = num / 100;
				user[1] = (num % 100) / 10;
				user[2] = (num % 100) % 10;
				System.out.println(user[0] + ", " + user[1] + ", " + user[2]);
			}

		} else {
			System.out.println("프로그램을 종료합니다.");
		}

	}
}
