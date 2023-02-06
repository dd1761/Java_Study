package for_;

import java.util.Scanner;

public class For04 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("x값 입력 : ");
		int x = scanner.nextInt();
		
		System.out.print("y값 입력 : ");
		int y = scanner.nextInt();
		
		int mul = 1;
		
		for(int i = 1; i <= y; i++) {
			mul = mul * x;
		}
		System.out.println(x + "의 " + y + "승은 " + mul);

	}

}
