package inheritance;

import java.util.Scanner;

class Shape {
	protected double area;
	protected Scanner scan = new Scanner(System.in);
	
	public Shape() {
		System.out.println("ShapeTest 기본생성자");
	}
	
	public void calcArea() {
		System.out.println("도형을 계산합니다");
	}
	
	public void dispArea() {
		System.out.println("도형을 출력합니다.");
	}
}

//------------------------------

class Sam extends Shape{
	protected int base, height;
	
	public Sam() {
		System.out.println("Sam 기본 생성자");
		System.out.print("밑변 : ");
		base = scan.nextInt();
		System.out.print("높이 : ");
		height = scan.nextInt();
		
	}
	
	
	@Override	// 어노테이션 오버라이드
	public void calcArea() {
		area = base * height / 2.0;
	}
	
	@Override	// 어노테이션 오버라이드
	public void dispArea() {
		System.out.println("삼각형 넓이 = " + area);
	}
}

class Sa extends Shape{
	protected int base, height;
	
	public Sa() {
		System.out.println("Sa 기본 생성자");
		System.out.print("밑변 : ");
		base = scan.nextInt();
		System.out.print("높이 : ");
		height = scan.nextInt();
	}
	
	@Override
	public void calcArea() {
		area = base * height;
	}
	
	@Override
	public void dispArea() {
		System.out.println("사각형 넓이 = " + area);
	}
}

class Sadari extends Shape{
	protected int base, height, top;
	
	public Sadari() {
		System.out.println("Sadari 기본 생성자");
		System.out.print("밑변 : ");
		base = scan.nextInt();
		System.out.print("높이 : ");
		height = scan.nextInt();
		System.out.print("윗변 : ");
		top = scan.nextInt();
	}
	
	@Override
	public void calcArea() {
		area = ((base + top) * height) / 2.0;
	}
	
	@Override
	public void dispArea() {
		System.out.println("사각형 넓이 = " + area);
	}
}



//------------------------
public class ShapeMain {

	public static void main(String[] args) {
		
		/*
		Sam sam  = new Sam();
		sam.calcArea();
		sam.dispArea();
		System.out.println();
		
		Sa sa = new Sa();
		sa.calcArea();
		sa.dispArea();
		System.out.println();
		
		Sadari sd = new Sadari();
		sd.calcArea();
		sd.dispArea();
		System.out.println();
		
		*/

		
		// 다형성 => 부모 = 자식
		Shape shape;
		shape = new Sam();
		shape.calcArea();
		shape.dispArea();
		System.out.println();
		
		shape = new Sa();
		shape.calcArea();
		shape.dispArea();
		System.out.println();
		
		shape = new Sadari();
		shape.calcArea();
		shape.dispArea();
		System.out.println();
		
		
	}

}





































