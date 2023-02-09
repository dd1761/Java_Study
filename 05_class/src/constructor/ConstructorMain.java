package constructor;

public class ConstructorMain {
	private int a;
	
	public ConstructorMain() {	// 기본생성자 default
		System.out.println("default 생성자");
	}

	public static void main(String[] args) {
		ConstructorMain aa = new ConstructorMain();
	}
}
//생성자 Cnstructor를 사용하는 이유는 객체를 초기화하기 위해서이다.