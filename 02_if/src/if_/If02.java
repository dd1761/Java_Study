package if_;

import java.util.Scanner;

public class If02 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("첫번째 점수를 입력해주세요 : ");
		int a = scanner.nextInt();
		
		System.out.print("두 번째 점수를 입력해주세요 : ");
		int b = scanner.nextInt();
		
		System.out.print("세 번째 점수를 입력해주세요 : ");
		int c = scanner.nextInt();
		
		int test = (a + b + c) / 3;
		
		/*
		if(test >= 60) {	// #1
			if( a >= 40) {	// #2
				if (b >= 40) {	// #3
					if (c >= 40) {	//#4
						System.out.println("a의 값 : " + a);
						System.out.println("b의 값 : " + b);
						System.out.println("c의 값 : " + c);
						System.out.println("합격");
					}	// #4
				}	//#3
			}	//#2
			if (a < 40) {	// #5
				System.out.println("a의 값 : " + a);
				System.out.println("b의 값 : " + b);
				System.out.println("c의 값 : " + c);
				System.out.println("과락으로 불합격");
			}	//#5
			if (b < 40) {	//#6
				System.out.println("a의 값 : " + a);
				System.out.println("b의 값 : " + b);
				System.out.println("c의 값 : " + c);
				System.out.println("과락으로 불합격");
			}	//#6
			if(c < 40) {	//#7
				System.out.println("a의 값 : " + a);
				System.out.println("b의 값 : " + b);
				System.out.println("c의 값 : " + c);
				System.out.println("과락으로 불합격");
			}	//#7
		}	// #1
		else  {	//#8
			System.out.println("a의 값 : " + a);
			System.out.println("b의 값 : " + b);
			System.out.println("c의 값 : " + c);
			System.out.println("불합격");
		}	//#8
		*/
		
		if(test >= 60) {
			if(a >=40 && b>=40 && c>=40) {
				System.out.println("합격");
			}else {
				System.out.println("과락으로 불합격");
			}
		}else {
			System.out.println("불합격");
		}
		
		
		
		
	}
	
}




