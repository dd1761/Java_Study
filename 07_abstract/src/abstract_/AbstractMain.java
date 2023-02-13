package abstract_;

public class AbstractMain extends AbstractTest {
	
	@Override
	public void setName(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
		AbstractTest at = new AbstractMain();	//추상클래스는 자신의 클래스로 메모리에 생성할 수 없다.
												// 직접적으로 new를 할 수 없다.
		at.setName("홍길동");
		System.out.println(at.getName());
		
		
	}

}


// 결과 홍길동