package interface_;

import java.util.Scanner;

public class Div implements Compute {

private int x, y;
	
	public Div() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("x의 값 입력 : ");
		x = scanner.nextInt();
		
		System.out.print("y의 값 입력 : ");
		y = scanner.nextInt();
		
	}

	@Override
	public void disp() {
		System.out.println(x + " / " + y + " = " + (x / y));
	}
}
