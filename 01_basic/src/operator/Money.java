package operator;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Money {

	public static void main(String[] args) {
//		int money = 5378;
		//commit
		
		int money;
		
		Scanner scan = new Scanner(System.in); //키보드로부터 입력받는 Scanner 클래스를 생성
		System.out.print("돈을 입력 : ");
		money = scan.nextInt();
		
		int chunwon = money / 1000;
		
		int chunwon_mod = money % 1000;
		int backwon = chunwon_mod / 100;
		int backwon_mod = chunwon_mod % 100;
		int shipwon = backwon_mod / 10;
		int ilwon = backwon_mod % 10;
		
		/*
		int money = 5378;
		int chunwon = money / 1000; 
		int backwon = ( money % 1000) / 100;
		int shipwon = (( money % 1000) % 100) / 10;
		int ilwon = (( money % 1000) % 100) % 10;
		*/
		
		
		DecimalFormat df = new DecimalFormat();
		
		System.out.println("현금 : " + df.format(money) + "원");		// 3자리마다 , 찍기 현금 : 5,378원 숫자가 아니라 문자열로 나타남.
		System.out.println("천원 : " + chunwon + "장");
		System.out.println("백원 : " + backwon + "개");
		System.out.println("십원 : " + shipwon + "개");
		System.out.println("일원 : " + ilwon + "개");
		
	
		
	}

}






/*
[문제] 현금 5378원

[실행결과]
현금 5378원
천원 : 5장
백원 : 3개
십원 : 7개
일원 : 8개
*/
