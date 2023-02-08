package class_;

class Person{
	private String name = null;	//String 값은 항상 null로 초기화 되어있다.
	private int age = 0;	// int값은 0으로 초기화 되어있다.
	
	public void setName(String n) {	//메소드 구현 / 결과형 메소드명()
		name = n;
		
	}
	
	public void setAge(Integer a) {
		age = a;
	}
	
	public void setData(String n, int a) {
		name = n;
		age = a;
	}
								// 같은 이름을 사용하는 메소드 Overload / Overloading
	public void setData() {		
		
	}
	
	public String getName(){
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	
	
		
}	// class Person

/* --------------------------------------------*/

public class PersonMain {
	
	public static void main(String[] args) {
		
		Person a;	// 객체 선언
		a = new Person();	// 생성해주어야 class 사용 가능
		
		System.out.println("객체 a = " + a);
		
		a.setName("홍길동");	//호출 - 호출한 함수는 반드시 제자리로 돌아온다.
		
		a.setAge(25); 
		
		System.out.println("이름 : " + a.getName() + "\t 나이 : " + a.getAge());
		
		Person b = new Person();	// b라는 객체를 생성해서 Person의 주소를 가지고 온다.
		System.out.println("객체 b = " + b);
		
		b.setName("코난");
		b.setAge(13);
		
		System.out.println("이름 : " + b.getName() + "\t 나이 : " + b.getAge());
		
		
		Person c = new Person();
		System.out.println("객체 c = " + c);
		c.setData("둘리" , 100);
		
		System.out.println("이름 : " + c.getName() + "\t 나이 : " + c.getAge());
		
		Person d = new Person();
		System.out.println("객체 d = " + d);
		d.setData();
		
		System.out.println("이름 : " + d.getName() + "\t 나이 : " + d.getAge());
		
	} // main

} // public class PersonMain
