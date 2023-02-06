package if_;

import java.util.Scanner;

public class if03 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); 
		
		System.out.print("a를 입력해주세요 : ");
		int a = scanner.nextInt();
		
		System.out.print("b를 입력해주세요 : ");
		int b = scanner.nextInt();
		
		System.out.print("c를 입력해주세요 : ");
		int c = scanner.nextInt();
		
		if(a > b && a > c) {
			if(b > c) {
				System.out.println(c + " " + b + " " + a);
			}
			if(c > b) {
				System.out.println(b + " " + c + " " + a);
			}
		}else if(b > a && b > c) {
			if(a > c) {
				System.out.println(c + " " + a + " " + b );
			}
			if(c > a) {
				System.out.println(a + " " + c + " " + b );
			}
		}
		else if(c > a && c > b) {
			if(a > b) {
				System.out.println(b + " " + a + " " + c );
			}
			if(b > a) {
				System.out.println(a + " " + b + " " + c );
			}
		}
		

	}

}
