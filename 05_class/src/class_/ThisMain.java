package class_;

class This{
	private int b;
	private static int c;

	
	public void setB(int b) {	//구현, 인수(argument), 매개변수(parameter)
		System.out.println("this = " + this);
		this.b = b;
	}
	
	public void setC(int c) {
		this.c = c;
	}
	
	public int getB() {	//반환되는 자료형을 사용
		return this.b;
	}
	
	public int getC() {
		return c;
	}
	
}


public class ThisMain {
	
	private int a;

	public static void main(String[] args) {		//static에서는 this를 사용할 수 없다.
		ThisMain tm = new ThisMain();
		tm.a = 10;	//같은 클래스에서 묶어버리면 사용가능하다.
		
		System.out.println("a = " + tm.a);
		System.out.println();
		
		This t = new This();
		t.setB(20);	//호출한 메소드는 반드시 돌아온다.
		System.out.println("t.b = " + t.getB());	//getB로 가서 return값을 가지고 온다.
		
		t.setC(30);
		System.out.println("t.c = " + t.getC());
		System.out.println();
		
		This w = new This();
		System.out.println("객체 w = " + w);
		w.setB(40);
		w.setC(50);
		System.out.println("w.b = " + w.getB());
		System.out.println("w.c = " + w.getC());
		
	}

}


//모든 클래스는 반드시 생성해야 한다.