package for_;

import java.util.Scanner;

public class Game {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int insertCoin, user, com;

		System.out.print("insert coin : ");
		insertCoin = scanner.nextInt();

		String enter;

		int coin = (insertCoin / 300);
		int i;

		if (coin >= 1) {
			for (i = 1; i <= coin; i++) {
				System.out.print("가위(1), 바위(2), 보(3) 중 번호를 입력해주세요 : ");
				user = scanner.nextInt();
				com = (int) (Math.random() * 3 + 1);

				enter = scanner.nextLine();
					if (user == 1) {
						if (com == 1) {
							System.out.println("컴퓨터 : 가위  나 : 가위");
							System.out.println("You Draw!!");
						} else if (com == 2) {
							System.out.println("컴퓨터 : 바위  나 : 가위");
							System.out.println("You Loss!!");
						} else {
							System.out.println("컴퓨터 : 보자기  나 : 가위");
							System.out.println("You Win!!");
						}
					}
					if (user == 2) {
						if (com == 1) {
							System.out.println("컴퓨터 : 가위  나 : 바위");
							System.out.println("You Win!!");
						} else if (com == 2) {
							System.out.println("컴퓨터 : 바위  나 : 바위");
							System.out.println("You Draw!!");
						} else {
							System.out.println("컴퓨터 : 보자기  나 : 바위");
							System.out.println("You Loss!!");
						}
					}
					if (user == 3) {
						if (com == 1) { 
							System.out.println("컴퓨터 : 가위  나 : 보자기");
							System.out.println("You Loss!!");
						} else if (com == 2) {
							System.out.println("컴퓨터 : 바위  나 : 보자기");
							System.out.println("You Win!!");
						} else {
							System.out.println("컴퓨터 : 보자기  나 : 보자기");
							System.out.println("You Draw!!");
						}
					}
				
			}

		} else {
			System.out.println("금액부족");
			
		}

	}

}
