package for_;

import java.util.Scanner;

public class For06 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("숫자 입력 : ");
		int y = scanner.nextInt();
		
		int factorial = 1;
		
		for(int i=1; i<= y; i++) {
			factorial = factorial * i;
			
		}
		System.out.println(y + "! = " +factorial);

	}

}

/*

[문제] 팩토리얼을 구하시오 (for)
- 입력되는 숫자는 1 ~ 10 사이만 입력한다.

[실행결과]
숫자 입력 : 3
3! = 6 (1*2*3)
---------------------

숫자 입력 : 5
5! = 120 (1*2*3*4*5)


*/