package for_;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); // (키보드로부터)입력을 받는 클래스 생성
		int coin = 0, number, answer;
		int pluscoin = 0;
		// String enter=null;
		int computer_number = 0;

		while (true) { // 브레이크 때 까지 조건에 충족하면 무한 루

			System.out.println("insert coin : ");
			coin = scan.nextInt();
			pluscoin = pluscoin + coin;
			int i = pluscoin;
			System.out.println(pluscoin+"원");

			for (i = pluscoin; i >= 300; i -= 300) {
				pluscoin = pluscoin - 300;

				if (i >= 300) {
					System.out.println("가위(1), 바위(2), 보(3) 중 번호 입력 : ");
					number = scan.nextInt();
					computer_number = (int) (Math.random() * 3 + 1);

					if (number == 1) {
						if (computer_number == 1) {
							System.out.println("컴퓨터 : 가위 \t 나 : 가위");

							System.out.println("You Draw!!");
						}

						else if (computer_number == 2) {
							System.out.println("컴퓨터 : 바위 \t 나 : 가위");
							System.out.println("You Lose!!");
						} else if (computer_number == 3) {
							System.out.println("컴퓨터 : 보 \t 나 : 가위");
							System.out.println("You Win!!");
						}
					} else if (number == 2) {
						if (computer_number == 1) {
							System.out.println("컴퓨터 : 가위 \t 나 : 바위");
							System.out.println("You Win!!");
						} else if (computer_number == 2) {
							System.out.println("컴퓨터 : 바위 \t 나 : 바위");
							System.out.println("You Draw!!");
						} else if (computer_number == 3) {
							System.out.println("컴퓨터 : 보 \t 나 : 바위");
							System.out.println("You Lose!!");
						}
					} else if (number == 3) {
						if (computer_number == 1) {
							System.out.println("컴퓨터 : 가위 \t 나 : 보");
							System.out.println("You Lose!!");
						} else if (computer_number == 2) {
							System.out.println("컴퓨터 : 바위 \t 나 : 보");
							System.out.println("You Win!!");
						} else {
							System.out.println("컴퓨터 : 보 \t 나 : 보");
							System.out.println("You Draw!");
						}
					} else if (number < 1 && number > 3) {
						break;
					}
				}

				
			}
//			i = i - 300;
			// 300보다 작은 코인 넣었을 때나 코인이 300보다 없을 때.
			if (i < 300) {
				System.out.println("다시 게임을 하시겠습니까? '예'는 1을 '아니오'는 2를 입력하세요.");
				answer = scan.nextInt();
				if (answer == 2) {
					System.out.println("시스템 종료");
					break;
				} else if (answer == 1) {
					continue;
				}
				break;
			}

		}

	}
}

// System.out.println("결과를 보려면 Enter를 치세요");
// enter = scan.nextLine();
// if (enter!=null)
// continue;

// System.out.print("결과를 보려면 Enter를 치세요");
// enter = scan.nextLine();

/*
 * [문제] 가위, 바위, 보 게임 - 가위(1), 바위(2), 보자기(3) 로 지정한다. - 컴퓨터(com)는 1 ~ 3까지 난수가 나온다.
 * - 1게임당 300원으로 한다. - 돈이 떨어지면 다시 게임할거냐고 물어보세요 (if, for문) [실행결과] insert coin :
 * 1000 가위(1), 바위(2), 보(3) 중 번호 입력 : 3 (user, 사용자가 입력) 결과를 보려면 Enter를 치세요 -->
 * 하려면 하고 말려면 말고 컴퓨터 : 바위 나: 보자기 You Win!! 가위(1), 바위(2), 보(3) 중 번호 입력 : 1 (user)
 * 컴퓨터 : 가위 나 : 가위 You Draw!! 가위(1), 바위(2), 보(3) 중 번호 입력 : 3 (user) 컴퓨터 : 가위 나 :
 * 보자기 You Lose!! 3 게임하면 되는 것임. 1000/300
 */
