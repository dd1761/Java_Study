package for_;

import java.util.Scanner;

public class AddGame {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int firstRandom, secondRandom;
		int count = 0;
		int question = 1;
		for (int i = 1; i <= 5; i++) {
			firstRandom = (int) (Math.random() * 90 + 10);
			secondRandom = (int) (Math.random() * 90 + 10);
			int dab = firstRandom + secondRandom;

			System.out.print("[" + question + "]" + firstRandom + " + " + secondRandom + " = ");
			int result = scanner.nextInt();
			if (result == dab) {
				System.out.println("참 잘했어요.");
				count = count + 1;
				question = question + 1;
			} else {
				for (int a = 1; a <= 2; i++) {
					System.out.print("[" + question + "]" + firstRandom + " + " + secondRandom + " = ");
					int result2 = scanner.nextInt();
					if (result2 == dab) {
						System.out.println("참 잘했어요.");
						count = count + 1;
						question = question + 1;
						break;
					} else {
						System.out.println("틀렸습니다");
						System.out.println("정답은 : " + dab + "입니다");
						question = question + 1;
						break;
					}
				}
			}

		}
		System.out.println("당신은 총 " + count + "문제를 맞추어서 점수 " + (count * 20) + "점 입니다.");
	}

}
