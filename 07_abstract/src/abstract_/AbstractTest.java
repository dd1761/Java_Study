package abstract_;

public abstract class AbstractTest {	//POJO	(Plain Old Java Object)
	protected String name;
	
	public AbstractTest() {
		
	}
	
	public AbstractTest(String name) {
		super();
		this.name = name;
	}


	public String getName() {	// 구현
		return name;
	}

//	public void setName(String name) {	// 구현
//		this.name = name;
//	}
	
	public abstract void setName(String name); // 추상메소드
	
}
