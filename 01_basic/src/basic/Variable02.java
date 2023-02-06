package basic;

class Test{	//클래스당 컴파일 시 클래스 파일 생성.
	int a = 10;
	static int b = 20;
	static String str;
}

/* ----------------------- */

public class Variable02 {
	int a; //필드, 초기화
	double b;	//필드
	static int c;	//자동 메모리 할당
	
	public static void main(String[] args) {
		int a = 5;	//지역변수(local variable) 쓰레기값
		Test test = new Test();
		Variable02 v = new Variable02();		//메모리 생성(할당)
		
		
		System.out.println("지역변수 a = " + a);	//지역변수 a = 5
		System.out.println("객체 = " + v);		//객체 = basic.Variable02@515f550a
		System.out.println("필드 a = " + v.a);	//필드 a = 0
		System.out.println("필드 b = " + v.b);	//필드 b = 0.0
		System.out.println("필드 c = " + c);		//필드 c = 0
		System.out.println("필드 c = " + Variable02.c);	//필드 c = 0
		System.out.println("test a = : " + test.a );	//test a = : 10
		System.out.println("test b = " + test.b);		//test b = 20
		System.out.println("test str = " + test.str);	//test str = null
		
		
		
	}

}
