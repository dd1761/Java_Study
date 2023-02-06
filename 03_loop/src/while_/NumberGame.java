package while_;

import java.util.Scanner;

public class NumberGame {

	public static void main(String[] args) {
		int com, user;
		int count = 0;
		String con;

		while (true) {
			com = (int) (Math.random() * 100 + 1); // com = (int) (Math.random() * + 65);
			Scanner scanner = new Scanner(System.in);
			System.out.println("1 ~ 100 사이의 숫자를 맞춰보세요");
			System.out.println(com);

			while (true) {
				System.out.print("숫자 입력 :  ");
				user = scanner.nextInt();

				if (user == com) {
					count = count + 1;
					System.out.println("딩동댕 " + count + "번만에 맞췄습니다.");
					break;
				}
				if (user > com) {
					System.out.println(user + "보다 작습니다!!");
					count = count + 1;
				}
				if (user < com) {
					System.out.println(user + "보다 큽니다!!");
					count = count + 1;
				}
			}
			System.out.println("한번 더 하시겠습니까? y(Y)/n(N)");
			con = scanner.next();
			if (con.equals("y") || con.equals("Y")) {
				count = 0;
				continue;
			} else if (con.equals("N") || con.equals("n")) {
				System.out.println("종료합니다.");
				break;
			}

		}
	}
}
