package interface_;

import java.util.Scanner;

public class ComputeService {

	public void menu() {
		int num;
		Scanner scanner = new Scanner(System.in);
		Compute com = null;
		int a, b;
		while(true) {
			
			System.out.println();
			System.out.println("1. 더하기");
			System.out.println("2. 빼기");
			System.out.println("3. 곱하기");
			System.out.println("4. 나누기");
			System.out.println("5. 끝내기");
			System.out.print("번호 입력 : ");
			num = scanner.nextInt();
			
			if(num == 5) {
				break;
			}
			if(num == 1) {
				com = new Sum();
				com.disp();
			}
			else if(num == 2) {
				com = new Sub();
				com.disp();
			}
			else if(num == 3) {
				com = new Mul();
				com.disp();
			}
			else if(num == 4) {
				com = new Div();
				com.disp();
			}
		}
		
	}
}
