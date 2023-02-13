package inheritance;


class Test extends Object {
	
}

//-------------

class Sample{
	@Override
	public String toString() {
		return getClass() + "@개바부";	//객체 t = class inheritance.Sample@개바부
	}
}

//-------------

class Exam{
	private String name = "홍길동";
	private int age = 25;
	
	@Override
	public String toString() {
		return name + "\t" + age;	//객체 e = 홍길동	25
	}
}


//-------------

public class ObjectMain {

	public static void main(String[] args) {
		Test t = new Test();
		System.out.println("객체 t = " + t);	//클래스명@16진수 객체 t = inheritance.Test@6f2b958e
		System.out.println("객체 t = " + t.toString());	//객체 t = inheritance.Test@6f2b958e
		System.out.println("객체 t = " + t.hashCode());	// main에서 찾다가 없으면 Test로 가서 Object에서 찾는다. 객체 t = 1865127310
		System.out.println();
		
		Sample s = new Sample();
		System.out.println("객체 t = " + s.toString());	//객체 t = class inheritance.Sample@개바부
		System.out.println();
	
		Exam e = new Exam();
		System.out.println("객체 e = " + e.toString());	//객체 e = inheritance.Exam@379619aa
		System.out.println();
		
		String aa = "apple";
		System.out.println("객체 aa = " + aa);
		System.out.println("객체 aa = " + aa.toString());	//객체 aa = apple 자체적인 Override
		System.out.println("객체 aa = " + aa.hashCode());	//문자열은 무한대이기 때문에 10진수로 표기가 안된다. 나오는 값은 믿으면 안됨.
		System.out.println();
		
		String bb = new String("apple");
		String cc = new String("apple");
		System.out.println("bb == cc : " + (bb==cc) );	//	bb == cc : false
		System.out.println("bb.equals(cc) : " + bb.equals(cc));	//bb.equals(cc) : true
		System.out.println();
		
		
		
		Object dd = new Object();
		Object ee = new Object();
		System.out.println("dd == ee : " + (dd==ee) );	//	dd == ee : false
		System.out.println("dd.equals(ee) : " + dd.equals(ee));	// dd.equals(ee) : false
		System.out.println();	// object자체는 주소만 비교한다. String일때만 문자열을 비교한다.
	
		Object ff = new String("apple");
		Object gg = new String("apple");
		System.out.println("ff == gg : " + (ff==gg) );	//	ff == gg : false
		System.out.println("ff.equals(gg) : " + ff.equals(gg));	// ff.equals(gg) : true	Override되어 자식인 String열을 비교.
		System.out.println();	// object자체는 주소만 비교한다. String일때만 문자열을 비교한다.
	
	
	
	
	
	}

}



/*

class Object {
	public String toString() {}	클래스명@16진수
	public int hashCode() {}	10진수
	public boolean equals(Object ob){}	참조값 비교
}

class String
	public String toString() {}	문자열
	public int hashCode() {}	10진수 (믿으면 안됨) - 문자열은 무한대로 표기가 되서 10진수 표기가 안된다. 
	public boolean equals(Object ob){}	문자열 비교


}



*/













