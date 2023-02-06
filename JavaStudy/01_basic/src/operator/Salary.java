package operator;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Salary {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in); 
		DecimalFormat df = new DecimalFormat();
		
		System.out.print("이름을 입력해주세요 : ");
		String name = scanner.next();
		
		System.out.print("직급을 입력해주세요 : ");
		String rank = scanner.next();

		System.out.print("기본급을 입력해주세요 : ");
		int money = scanner.nextInt();
		
		System.out.print("수당을 입력해주세요 : ");
		int plusmoney = scanner.nextInt();
		
		int sum = money + plusmoney;
		
		double tax = sum >= 5000000 ? sum * 0.03 : sum >= 3000000 ? sum * 0.02 : sum * 0.01;
		int month = (money + plusmoney) - (int)tax;
			
		//tax = sum < 5000000 &&  sum >= 3000000 ? sum * 0.02 : sum;
		//tax = sum < 1000000 ? sum * 0.01 : sum;
		System.out.println("*** " + name + " " + rank + " 월급 ***");
		System.out.println("기본급 : " + df.format(money)+"원");
		System.out.println("수당 : " + df.format(plusmoney)+"원");
		System.out.println("합계 : " + df.format(sum)+"원");
		System.out.println("세금 : " + df.format((int)tax)+"원");
		System.out.println("월급 : " + df.format(month)+ "원");
	}

}

/*
[문제] 월급 계산 프로그램 - 조건 연산자
이름, 직급, 기본급, 수당을 입력하여 합계, 세금, 월급을 출력하시오
단 합계가 5,000,000원 이상이면 3%
       3,000,000원 이상이면 2%
       아니면 1%
       
합계 = 기본급 + 수당
세금 = 합계 * 세율
월급 = 합계 - 세금

[실행결과]
이름 입력 : 홍길동
직급 입력 : 부장
기본급 입력 : 4900000
수당 입력 : 200000

*** 홍길동 부장 월급 ***
기본급 : 4,900,000원
수당 : 200,000원
합계 : 5,100,000원
세금 : 153,000원
월급 : 4,947,000원

*/

