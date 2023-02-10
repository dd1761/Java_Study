package inheritance;

public class SubMain extends Super{
	private String name;
	private int age;
	
	
	
	SubMain(){
		System.out.println("Super 기본 생성자");
	}
	SubMain(String name, int age, double weight, double height){
		this.name = name;
		this.age = age;
		super.weight = weight; //this.weight = weight;
		this.height = height;
	}
	
	public void output() {
		System.out.println("이름 = " + name);
		System.out.println("나이 = " + age);
		this.disp();
	}
	
	

	public static void main(String[] args) {
		
		SubMain aa = new SubMain("홍길동", 25, 73.5, 182.6);
		aa.disp(); 		//부모 메소드 출력
		System.out.println("-------------------");
		aa.output();
		System.out.println("===================");
		
		Super bb = new SubMain("코난", 13, 53.6, 156.6);
		//bb.output();	- error
		bb.disp();
		
	}

}

/*
자식클래스는 메모리 생성할 때 
- 부모 클래스 생성
- 자식 클래스 생성




*/