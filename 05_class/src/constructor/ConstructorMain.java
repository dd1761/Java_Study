package constructor;

public class ConstructorMain {
	private String name;
	private int age;

	public ConstructorMain() { // 기본생성자 default
		System.out.println("default 생성자");
	}

	// 생성자 Overload 이름이 같음
	public ConstructorMain(String name) {
		this();
		System.out.println("name 처리 생성자");
		this.name = name;
	}

	public ConstructorMain(int age) {
		this("코난"); //Overload된 다른 생성자를 호출할 수 있다.
		System.out.println("age 처리 생성자");
		this.age = age;
	}

	public static void main(String[] args) {
		ConstructorMain aa = new ConstructorMain();	//default 생성자부름. 생성자에 void가 붙어있으면 불러올 수 없음.
		System.out.println(aa.name + "\t" + aa.age);
		System.out.println();

		ConstructorMain bb = new ConstructorMain("홍길동"); // ConstructorMain(name)으로 가서 name을 반환
		System.out.println(bb.name + "\t" + bb.age);
		System.out.println();

		ConstructorMain cc = new ConstructorMain(25);
		System.out.println(cc.name + "\t" + cc.age);
		System.out.println();

	}
}
//생성자 Constructor를 사용하는 이유는 객체를 초기화하기 위해서이다.
// 생성자에 void를 붙이게 되면 일반함수가 되어버려 결과값이 나오지 않게된다.