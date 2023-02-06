package switch_;

import java.util.Scanner;

public class Switch02 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int a, b;
		System.out.print("a를 입력해주세요 : ");
		a = scanner.nextInt();
		
		System.out.print("b를 입력해주세요 : ");
		b = scanner.nextInt();
		
		
		System.out.print("연산자를 입력해주세요 : ");
		String op = scanner.next();
		
		switch(op) {
		
		case "+" :
			System.out.println(a + " + " + b + " = " + (a + b) );
			break;
		case "-" : 
			System.out.println(a + " - " + b + " = " + (a - b) );
			break;
		case "*" :
			System.out.println(a + " * " + b + " = " + (a*b) );
			break;	
		case "/":
			System.out.println(a + " / " + b + " = " + ((double)a / b) );
			break;
		
		default:
			System.out.println("연산자 Error");
		}
		//
		

	}

}
