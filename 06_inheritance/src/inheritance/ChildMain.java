package inheritance;

public class ChildMain extends Super{
	private String name;
	private int age;
	
	ChildMain(){
		System.out.println("Super 기본 생성자");
	}
	ChildMain(String name, int age, double weight, double height){
		super(weight, height);// 부모 생성자 호출
		
		this.name = name;
		this.age = age;
//		super.weight = weight; //this.weight = weight;
//		this.height = height;
	}
	
	public void disp() {
		System.out.println("이름 = " + name);
		System.out.println("나이 = " + age);
		super.disp();	//this를 사용하면 부한반복하게 되어 메모리가 다운된다.
						// super 사용
	}

	public static void main(String[] args) {
		ChildMain aa = new ChildMain("홍길동", 25, 73.5, 182.6);
		aa.disp();
		System.out.println("===================");
		
		Super bb = new ChildMain("코난", 13, 53.6, 156.6);
		bb.disp();
		
	}

}
