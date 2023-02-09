package class_;

class This{
	private int b;

	
	public void setB(int b) {	//구현, 인수(argument), 매개변수(parameter)
		this.b = b;
	}
	
	public int getB() {
		return b;
	}
	
}


public class ThisMain {
	
	private int a;

	public static void main(String[] args) {
		ThisMain tm = new ThisMain();
		tm.a = 10;	//같은 클래스에서 묶어버리면 사용가능하다.
		
		System.out.println("a = " + tm.a);
		
		This t = new This();
		t.setB(20);
		System.out.println("b = " + t.getB());
		

	}

}


//모든 클래스는 반드시 생성해야 한다.