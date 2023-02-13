package class__;

import java.util.Scanner;

public class Exam {

	Scanner scanner = new Scanner(System.in);

	private String name;
	private String dap;
	private char[] ox = null;
	private int score = 0;
	private final String JUNG = "11111";

	public Exam() {
		System.out.print("이름 입력 : "); // private name
		this.name = scanner.next();

		System.out.print("답 입력 : "); // private dap;
		this.dap = scanner.next();

		ox = new char[5]; // 생성

	
	}

	public void compare() {
		for (int i = 0; i < JUNG.length(); i++) {
			if (dap.charAt(i) == JUNG.charAt(i)) {
				ox[i] = 'o';
				score += 20;
			} else {
				ox[i] = 'x';
			}

		}

	}

	public String getName() {
		return name;
	}

	public String getDap() {
		return dap;
	}

	public char[] getOX() {
		return ox;
	}

	public int getScore() {
		return score;

	}

}