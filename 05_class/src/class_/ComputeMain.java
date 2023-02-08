package class_;

import java.util.Scanner;

public class ComputeMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.print("횟수 입력 : ");
		int count = scanner.nextInt();
		
		Compute[] ar = new Compute[count];
		
		for(int i = 0; i < count; i++) {
				System.out.println("[" + (i+1) + "번째]");
				
				System.out.print("x입력 : ");
				int x = scanner.nextInt();
				
				System.out.print("y입력 : ");
				int y = scanner.nextInt();
				System.out.println();
				
				ar[i] = new Compute();
				ar[i].setData(x, y);
				ar[i].calc();
				
				// 클래스 생성
				Compute aa;
				aa = new Compute();
				aa.setData(x, y);
				
				
		}	// for i
		
		for(int i = 0; i < count; i++) {
			System.out.println();
			System.out.println(ar[i].getX() + "\t"
					   			+ar[i].getY() + "\t"
					   			+ar[i].getSum() + "\t"
					   			+ar[i].getSub() + "\t"
					   			+ar[i].getMul() + "\t"
					   			+ar[i].getDiv());
		}
		
	}

}
/*
[문제] 사칙연산
x, y를 입력하여 합, 차, 곱, 몫을 구하시오

클래스명 : Compute (1인분)
필드 : x, y, sum, sub, mul, div
메소드 : setData(x의 값, y의 값)
        calc()
        getX()
        getY()
        getSum()
        getSub()
        getMul()
        getDiv()
        
클래스명 : ComputeMain        

[실행결과]
횟수 입력 : 2

[1번째]
x 입력 : 25
y 입력 : 36

[2번째]
x 입력 : 35
y 입력 : 12

x   y   sum      sub      mul      div
25   36
35   12

*/