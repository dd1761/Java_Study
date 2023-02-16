package exception;

import java.util.Scanner;

public class ExceptionMain2 {
	private int x, y;

	public void input() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("x 입력 : ");
		this.x = scanner.nextInt();

		System.out.print("y 입력 : ");
		this.y = scanner.nextInt();

	}

	public void output() {
		if (y >= 0) {

			int mul = 1;
			for (int i = 1; i <= y; i++) {
				mul = mul * x;
			}
			System.out.println(x + "의" + "y승은 " + mul);

		}
		else {
//			System.out.println("y는 0보다 크거나 같아야 한다.");
			try {
				throw new Exception("y는 0보다 크거나 같아야 한다.");//개발자가 강제로 Exception 발생
			}catch(Exception e){
				e.printStackTrace();
			}
			
		}
	}

	public static void main(String[] args) {
		ExceptionMain2 exceptionMain2 = new ExceptionMain2();
		exceptionMain2.input();
		exceptionMain2.output();

	}

}

/*
 * [문제] 제곱 연산 - x의 y승을 처리 한다.
 * 
 * [실행결과] x 입력 : 2 
 * y 입력 : 10 
 * input() 
 * ---------------------------------- 
 * 2의 10승은
 * xxx output()
 * 
 */