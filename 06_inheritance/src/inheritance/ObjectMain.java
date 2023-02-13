package inheritance;


class Test extends Object {
	
}

//-------------

class Sample{
	@Override
	public String toString() {
		return "개바부";
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
		System.out.println("객체 t = " + s.toString());	//객체 t = 개바부
	}

}
